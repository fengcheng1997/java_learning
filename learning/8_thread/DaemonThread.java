public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
//        t.setDaemon(true);
        t.start();
        Thread.sleep(1000);
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

class MyThread extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.setDaemon(true);
        hello.start(); // 启动hello线程
        try {
            System.out.println("before hello join!");
            hello.join(); // 等待hello线程结束
            System.out.println("after hello join!");
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
//        hello.interrupt(); //注释这个interrupt,在hello.start()或者t.start();前加入守护进程xxx.setDaemon(true)
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}