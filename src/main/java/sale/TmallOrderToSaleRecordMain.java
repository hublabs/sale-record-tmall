package sale;

import masterdata.OnlineShop;
import org.apache.commons.cli.*;
import tmall.PeriodType;
import tmall.TmallTrade;
import utils.DataConnection;
import utils.DateUtil;
import utils.TimeRange;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class TmallOrderToSaleRecordMain {
  public static void main(String... args) throws Exception {
    TmallOrderToSaleRecordMain appMain = new TmallOrderToSaleRecordMain();
    //    args = new String[]{"-from", "20190101000000", "-to", "20190601000000", "-periodType", "created", "-failed"};
    appMain.run(args);
  }

  private void run(String[] args) throws Exception {
    CommandLine commandLine = parseParameters(args);
    final DataConnection dataConnection = DataConnection.getInstance();
    Runtime.getRuntime().addShutdownHook(new Thread() {
      public void run() {
        try {
          dataConnection.close();
        } catch (Exception e) {
        }
      }
    });
    String fromDateOption = commandLine.getOptionValue("from");
    String toDateOption = commandLine.getOptionValue("to");
    String optShopCode = commandLine.getOptionValue("shop");
    Date fromDate = null;
    Date toDate = null;
    if (fromDateOption != null) {
      fromDate = DateUtil.MILLIS_DATE_FORMAT.parse(fromDateOption + "000");
      toDate = DateUtil.MILLIS_DATE_FORMAT.parse(toDateOption + "999");
    } else {
      Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
      toDate = cal.getTime();
      cal.add(Calendar.DATE, 60);
      fromDate = cal.getTime();
    }
    String periodTypeOption = commandLine.getOptionValue("periodType");
    PeriodType periodType = PeriodType.FETCHED;
    if (periodTypeOption != null) {
      switch (periodTypeOption) {
        case "created":
          periodType = PeriodType.CREATED;
          break;
        case "modified":
          periodType = PeriodType.MODIFIED;
          break;
      }
    }
    String tenantCode = "";

    Boolean onlyFailed = false;

    TimeRange timeRange = new TimeRange(fromDate, toDate);
    List<TimeRange> timeRanges = timeRange.generateTimeRangeList(Calendar.DATE, 5);

    List<OnlineShop> shopList = OnlineShop.find(true, true);
    for (OnlineShop eachShop: shopList) {
      for(TimeRange eachTimeRange: timeRanges) {
        //generate sale logic
        List<TmallTrade> tmallTradeList = TmallTrade.findReadyDataByShopAndPeriod(tenantCode, eachShop.getShopCode(), eachTimeRange.getFromDate(), eachTimeRange.getToDate(), onlyFailed, periodType);
//    LOG.info(tmallTradeList.size() + " row sale data fetched.");
        if (!tmallTradeList.isEmpty()) {
          int countData = 0;
          for (TmallTrade eachTrade : tmallTradeList) {
            countData++;
            SaleGenerator.generateSaleRecord(eachTrade);
            if (countData % 100 == 0 || countData == tmallTradeList.size()) {
              //TODO: log feature to next sprint
//              LOG.info("start modified:" + dfLite.format(eachTrade.getModified()) + "; complete count:" + countData);
            }
          }
        }

        //TODO: generate refund sale logic
      }
    }
  }

  private CommandLine parseParameters(final String[] args) {
    Options options = new Options();

    Option shopOption = new Option("shop", "shop", true, "shop");
    shopOption.setRequired(false);
    options.addOption(shopOption);

    Option pending = new Option("pending", "pending", false, "pending only");
    pending.setRequired(false);
    options.addOption(pending);

    Option failed = new Option("failed", "failed", false, "failed only");
    failed.setRequired(false);
    options.addOption(failed);

    Option fromDateOption = new Option("from", "from", true, "from date time");
    fromDateOption.setRequired(false);
    fromDateOption.setArgName("yyyyMMddHHmmss");
    options.addOption(fromDateOption);

    Option toDateOption = new Option("to", "to", true, "to date time");
    toDateOption.setRequired(false);
    toDateOption.setArgName("yyyyMMddHHmmss");
    options.addOption(toDateOption);

    Option periodType = new Option("periodType", "periodType", true, "periodType");
    shopOption.setRequired(false);
    options.addOption(periodType);

    CommandLineParser commandLineParser = new DefaultParser();

    try {
      return commandLineParser.parse(options, args);
    } catch (Exception e) {
      HelpFormatter helpFormatter = new HelpFormatter();
      helpFormatter.printHelp("TmallOrderToSaleRecord", options);
      System.exit(-1);
      return null;
    }
  }
}
