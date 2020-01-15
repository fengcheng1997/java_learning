import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class OwnException {
    public static byte[] toGBK(String s) {
        try{
        System.out.println("There is a no exception");
        return s.getBytes("GBK");

        } catch (UnsupportedEncodingException e){
            System.out.println(e);
            System.out.println("There is an exception");
            return s.getBytes();
        } finally {
            System.out.println("End");
        }
    }
    
    public static void main(String[] args) {
        byte[] bs = OwnException.toGBK("中文");
        System.out.println(Arrays.toString(bs));

    }


}