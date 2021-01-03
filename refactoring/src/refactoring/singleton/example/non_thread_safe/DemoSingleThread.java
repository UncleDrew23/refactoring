package refactoring.singleton.example.non_thread_safe;

/**
 * @program: refactoring
 * @description: 单例模式（单线程）客户端
 * @author: ycbron
 * @create: 2021-01-03 09:53
 **/
public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
