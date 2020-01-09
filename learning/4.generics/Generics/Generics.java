import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add(("Hello"));
        list.add(("World"));

        String first = (String) list.get(0);
        String second = (String) list.get(1);

        System.out.println("output1:" + first + second);

        //如果不定义泛型，则<T>当做Object使用，没有发挥泛型的优势，Object需要强制转型String

        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("world");

        String stringFirst = stringList.get(0);
        String stringSecond = stringList.get(1);

        System.out.println("output2:" + stringFirst + stringSecond);

        //使用泛型，不需要强制转型

//        List<Number> numberList = new ArrayList<Number>();
        // 可以省略后面的Number，编译器可以自动推断泛型类型：
        List<Number> numberList = new ArrayList();
        numberList.add(new Integer(123));
        numberList.add(new Double(12.34));
        Number numberFirst = numberList.get(0);
        Number numberSecond = numberList.get(1);

        System.out.println("output3:" +  numberFirst + " and " + numberSecond);
    }
}