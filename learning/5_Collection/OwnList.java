import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class OwnList{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("apple");
        System.out.println(list.size());

//        List<Integer> intList = List.of(1,2,3);//JDK9才有的特性
        for(String i : list){
            System.out.println(i);
        }

    }
}