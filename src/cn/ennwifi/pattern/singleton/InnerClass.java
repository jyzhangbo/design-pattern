package cn.ennwifi.pattern.singleton;

/**
 * 使用内部类保证线程安全.
 * 
 * @author zhangbo
 *
 */
public class InnerClass {

  private InnerClass() {}

  private static class Handler {
    private static final InnerClass innerClass = new InnerClass();
  }

  public static InnerClass getInstance() {
    return Handler.innerClass;
  }

}
