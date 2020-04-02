package utils;

import java.io.InputStream;
import java.util.Properties;

public class ResourceUtil {
  private static Properties resoureProps;
  public static String RESOURCE_NAME;

  public static synchronized Properties getAppProps() throws Exception {
    if (resoureProps == null) {
      String mode = System.getProperty("APP_ENV");
      if (mode == null) {
        mode = System.getenv("APP_ENV");
      }
      if (mode == null) {
        mode = "development";
      }
      RESOURCE_NAME = mode + ".properties";
//      System.out.println("==> Load properties from " + RESOURCE_NAME);

      resoureProps = new Properties();
      try (InputStream resourceStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(RESOURCE_NAME)) {
        resoureProps.load(resourceStream);
      }
    }

    return resoureProps;
  }
}
