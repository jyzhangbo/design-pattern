package cn.ennwifi.pattern.singleton;

/**
 * 懒汉式.
 * 
 * @author zhangbo
 *
 */
public class LazyStyle {

  private static LazyStyle lazyStyle = null;

  private LazyStyle() {}

  public static LazyStyle getInstance() {
    if (lazyStyle == null) {
      lazyStyle = new LazyStyle();
    }
    return lazyStyle;
  }
}
