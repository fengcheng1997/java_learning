public class MultiThread {
    public static void main(String[] args) {
        System.out.println("main start");
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("thread start");
                System.out.println("thread end");
            }
        };
        t.start();

        try{
            Thread.sleep(20);
        } catch (InterruptedException e) {}

        System.out.println("main end");
    }
}