package cn.ennwifi.pattern.singleton;

/**
 * @author zhangbo
 *
 */
public class LazySynStyle {

  private LazySynStyle() {}

  private static LazySynStyle lazySynStyle;

  public static synchronized LazySynStyle getInstance() {
    if (lazySynStyle == null) {
      lazySynStyle = new LazySynStyle();
    }
    return lazySynStyle;
  }

}
