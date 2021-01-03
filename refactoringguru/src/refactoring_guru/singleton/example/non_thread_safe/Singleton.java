package refactoring_guru.singleton.example.non_thread_safe;

/**
 * @program: refactoringguru
 * @description: 单例模式（单线程）实现
 * @author: ycbron
 * @create: 2021-01-03 09:32
 **/
public class Singleton {
    //在类中添加一个私有静态成员变量用于保存单例实例
    private static Singleton instance;

    public String value;

    //将类的构造函数设为私有。 类的静态方法仍能调用构造函数， 但是其他对象不能调用
    private Singleton(String value) {
        //
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    //声明一个公有静态构建方法用于获取单例实例
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
