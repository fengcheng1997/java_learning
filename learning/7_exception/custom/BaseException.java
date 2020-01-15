public class BaseException extends RuntimeException {
    public BaseException(){
        super();
    }

    public BaseException(String message, Throwable cause) {
        super();
    }

    public BaseException(String message){
        super();
//        System.out.println(message);
    }

    public BaseException(Throwable cause){
        super();
    }

    public static void main(String[] args) {
        throw new BaseException("This is a test!");
    }
}