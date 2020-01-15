import java.util.Collections;

public class SynchronizedThread{
    public static void main(String[] args) throws Exception{
        Thread add = new AddThread();
        Thread sub = new SubThread();
        add.start();
        sub.start();

        System.out.println("count in the middle process:" + Counter.count);

        add.join();
        sub.join();
        System.out.println("final count:" + Counter.count);
    }
}

class Counter {
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (Counter.lock) {
                Counter.count += 1;
            }
        }
    }
}

class SubThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (Counter.lock) {
                Counter.count -= 1;
            }
        }
    }
}