//import java.io.*;
//import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Syntax {
//    @SuppressWarnings("unchecked") //将uncheck的警告去掉
    public static void main(String args[]) {
        // while
//        int x =10;
//        while(x < 20) {
//            x++;
//            System.out.println("Hello world");

        // for
//        for(int x=10; x<20;x=x+1){
//            System.out.print("Value of x: " + x);
//            System.out.print('\n');
//        }

        // break
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        int y = 1;
//        while(y < 3) {
//            for (int x : numbers) {
//                if (x == 30) {
//                    break;
//                }
//                System.out.print(x + y);
//                System.out.print("\n");
//
//            }
//            break;
//        }

        // continue
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        for (int x : numbers){
//            if (x == 30){
//                continue;
//            }
//            System.out.print(x);
//            System.out.print("\n");
//        }

        // if...else
//        int x = 30;
//
//        if( x == 10){
//            System.out.print("Value of X is 10");
//        }else if( x == 20){
//            System.out.print("Value of X is 20");
//        }else if( x == 30){
//            System.out.print("Value of X is 30");
//        }

        // switch
//        char grade = 'C';
//
//        switch(grade){
//            case 'A':
//                System.out.println("优秀");
//                break;
//            case 'B':
//                System.out.println("优良");
//                break;
//            case 'C':
//                System.out.println("一般");
//                break;
//            default:
//                System.out.println("太差或者无效等级");
//        }
//        System.out.println("你的等级是：" + grade);

        // Number
//        Integer x = 5;
//        x = x + 10;
//        System.out.println(x);

        // Math
//        System.out.println("90度的正弦值：" + Math.sin(Math.PI/2));

        // String
//        Float floatVar = 1f;
//        Integer intVar = 1;
//        String stringVar = "1.1";
////
////        System.out.printf("The value of the float variable is " +
////                          "%f, while the value of the integar " +
////                          "variable is %d, and the string "  +
////                          "is %s", floatVar, intVar, stringVar);
//
//        // format
//        String fs = String.format("浮点型变量的值为 " +
//                "%f, 整型变量的值为 " +
//                " %d, 字符串变量的值为 " +
//                " %s", floatVar, intVar, stringVar);
//        System.out.print(fs);

        // StringBuffer and StringBuilder
//        StringBuffer sBuffer = new StringBuffer("test");
//        sBuffer.append(" String Buffer");
//        System.out.println(sBuffer);

//        StringBuilder sBuilder = new StringBuilder("test");
//        sBuilder.append(" String Builder");
//        System.out.println(sBuilder);

        // array

//        double[] mylist;
//        mylist =  new double[10];
//        mylist = double[]{1d,2d,3d,4d,5d,6d,7d,8d,9d}; // 错误


//        int[] mylist = {0,1,2,3,4,5,6,7,8,9};

//        double[] mylist = {1,2,3,4,5};
//
//        System.out.println(mylist.length);
//
//        double max = Double.MIN_VALUE;
//        for(double element : mylist){
//            System.out.println(element);
//
//            if(element > max) max = element;
//        }
//
//        System.out.println(max);

//        String s[][] = new String[2][];
//        s[0] = new String[2];
//        s[1] = new String[3];
//        s[0][0] = new String("Good");
//        s[0][1] = new String("Luck");
//        s[1][0] = new String("to");
//        s[1][1] = new String("you");
//        s[1][2] = new String("!");
//
//        for(String[] element : s) {
//            for(String string : element) System.out.println(string);
//        }

        // ArrayList 和泛型
//        @SuppressWarnings("unchecked") // 放在方法之上可以将注释将警告信息去掉
//        List list = new ArrayList(); // 非泛型,list默认的类型为Object类型
//        list.add("str1");
//        list.add("test");
//        list.add(100);
//        Syntax.java:148: 警告: [unchecked] 对作为原始类型List的成员的add(E)的调用未经过检查


//        List<String> list = new ArrayList<String>();
//        list.add("str1");
//        list.add("test");
////        list.add(100);  //编译阶段这里就会报错
//



//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            System.out.println("name:" + name);
//        }

        // date

//        Date date = new Date();
//
//
//        System.out.println(date.toString());



    }
}