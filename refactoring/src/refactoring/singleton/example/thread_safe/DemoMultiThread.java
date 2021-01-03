package refactoring.singleton.example.thread_safe;


/**
 * @program: refactoring
 * @description: 采用延迟加载的线程安全单例模式（多线程）客户端
 * @author: ycbron
 * @create: 2021-01-03 21:38
 **/
public class DemoMultiThread {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    //实现Runnable接口来创建线程
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
