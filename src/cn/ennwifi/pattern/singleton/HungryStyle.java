package cn.ennwifi.pattern.singleton;

/**
 * 饿汉式.
 * 
 * @author zhangbo
 *
 */
public class HungryStyle {

  private HungryStyle() {}

  private static HungryStyle hungryStyle = new HungryStyle();

  public static HungryStyle getInstance() {
    return hungryStyle;
  }

}
