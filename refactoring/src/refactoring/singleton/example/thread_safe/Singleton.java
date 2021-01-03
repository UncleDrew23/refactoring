package refactoring.singleton.example.thread_safe;

/**
 * @program: refactoring
 * @description: 采用延迟加载的线程安全单例实现
 * @author: ycbron
 * @create: 2021-01-03 09:32
 **/
public final class Singleton {
    //每个线程访问一个 volatile 作用域时会在继续执行之前读取它的当前值，而不是（可能）使用一个缓存的值。
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    //双重检查锁定：用来减少并发系统中竞争和同步的开销
    //1、检查变量是否被初始化(不去获得锁)，如果已被初始化立即返回这个变量。
    //2、获取锁
    //3、第二次检查变量是否已经被初始化：如果其他线程曾获取过锁，那么变量已被初始化，返回初始化的变量。
    //4、否则，初始化并返回变量。
    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null){
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
