package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TimeRange implements Comparable<TimeRange> {
  private Date fromDate;
  private Date toDate;

  public Date getFromDate() {
    return fromDate;
  }

  public Date getToDate() {
    return toDate;
  }

  public TimeRange(Date fromDate, Date toDate) {
    this.fromDate = fromDate;
    this.toDate = toDate;
  }

  public List<TimeRange> generateTimeRangeList(Integer dateField, Integer range) throws Exception {
    int INT_RANGE = 1;
    int DATE_FIELD = Calendar.DATE;
    if (range != null) {
      INT_RANGE = range;
    }
    if (dateField != null) {
      DATE_FIELD = dateField;
    }
    List<TimeRange> timeRanges = new ArrayList<>();
    Calendar cal = Calendar.getInstance();
    cal.setTime(this.fromDate);
    Date fromDate = this.fromDate;
    Date toDate = null;


    while (fromDate.compareTo(this.toDate) < 0) {
      if (toDate == null) {
        cal.add(DATE_FIELD, INT_RANGE);
        toDate = cal.getTime();
      }
      if (toDate.compareTo(this.toDate) > 0) {
        toDate = this.toDate;
      }

//      LOG.info("period:" + DateUtil.formatDate(fromDate) + " ~ " + DateUtil.formatDate(toDate));
      System.out.println("period:" + DateUtil.formatDate(fromDate) + " ~ " + DateUtil.formatDate(toDate));
      TimeRange timeRange = new TimeRange(fromDate, toDate);
      timeRanges.add(timeRange);

//      cal.add(Calendar.SECOND, 1);
      fromDate = cal.getTime();
      cal.add(DATE_FIELD, INT_RANGE);
//      cal.add(Calendar.SECOND, -1);
      toDate = cal.getTime();
    }
    return timeRanges;
  }

  @Override
  public int compareTo(TimeRange o) {
    int result = fromDate.compareTo(o.fromDate);
    if (result != 0) {
      return result;
    }

    return toDate.compareTo(o.toDate);
  }
}
