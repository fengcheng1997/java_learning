import java.util.Iterator;

public class Throw {
    public static void main(String[] args) {
//        try{
//            process1();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        process1();
    }

//    static void process1(){
//        process2();
//    }
//
//    static void process2(){
//        Integer.parseInt(null);

    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process2() {
        throw new NullPointerException();
    }


}

