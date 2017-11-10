package cn.ennwifi.pattern.singleton;

/**
 * 加锁保证线程安全.
 * 
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
