//public class InterruptThread {
//    public static void main(String[] args) throws InterruptedException{
//        Thread mythread = new MyThread();
//        mythread.start();
//        Thread.sleep(1000);
//        mythread.join();
//        mythread.interrupted();
//        System.out.println("All end");
//    }
//}
//
//class MyThread extends Thread {
//    public void run() {
//        Thread hello = new HelloThread();
//        hello.start();
////        hello.join();
////        hello.interrupt();
//
//        try{
//            hello.join();
//        } catch (InterruptedException e){
//            System.out.println("MyThread end");
//        }
//
//        hello.interrupt();
//    }
//}
//
//class HelloThread extends Thread {
//    public void run() {
//        int n = 0;
//        while (!isInterrupted()){
//            n++;
//            System.out.println(n + "hello!");
//
//            try{
//                Thread.sleep(100);
//            } catch (InterruptedException e){
//                e.printStackTrace();
//                break;
//            }
//
//        }
//    }
//}

public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
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
        hello.start(); // 启动hello线程
        try {
            System.out.println("before hello join!");
            hello.join(); // 等待hello线程结束
            System.out.println("after hello join!");
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
        hello.interrupt();
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