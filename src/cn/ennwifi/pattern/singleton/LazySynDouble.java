package cn.ennwifi.pattern.singleton;

/**
 * @author zhangbo
 *
 */
public class LazySynDouble {

  private LazySynDouble() {}

  private static LazySynDouble lazySynDouble;

  public static LazySynDouble getInstance() {
    if (lazySynDouble == null) {
      synchronized (LazySynDouble.class) {
        if (lazySynDouble == null) {
          lazySynDouble = new LazySynDouble();
        }
      }
    }
    return lazySynDouble;
  }

}
