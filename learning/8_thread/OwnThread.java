public class OwnThread {
    public static void main(String[] args) {
//        Thread t = new MyThread();
        Thread t = new Thread(new MyThread());
        t.start(); //start()方法会在内部自动调用实例的run()方法
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread");
    }
}