package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateUtil {
  static DateFormat fieldDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  public static Date parseDate(String str) {
    if (str != null && Pattern.matches("((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01]) ([2][0-3]|[0-1][0-9]|[1-9]):[0-5][0-9]:([0-5][0-9]|[6][0]).*", str)) {
      try {
        return fieldDateFormat.parse(str);
      } catch (Exception e){
        return null;
      }
    }
    return null;
  }
  public static String formatDate(Date param) {
      return fieldDateFormat.format(param);

  }
  public static DateFormat MILLIS_DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmssSSS");
}
