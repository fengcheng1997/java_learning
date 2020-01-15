import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class OwnCollections {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(8);
        nums.add(9);
        nums.add(5);
        nums.add(3);
        nums.add(10);
        nums.add(-4);
        nums.add(1);


        //排序
        /*************************/
        System.out.println(nums);

        /*************************/
        Collections.reverse(nums);
        System.out.println(nums);

        /*************************/
        Collections.sort(nums);
        System.out.println(nums);

        /*************************/
        Collections.shuffle(nums);
        System.out.println(nums);

        //定制排序
        //方法1
//        Collections.sort(nums, new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2){
//                String s1 = String.valueOf((o1));
//                String s2 = String.valueOf((o2));
//                return s1.compareTo(s2);
//            }
//        });

        //方法2
        class SortComparator implements Comparator{
            @Override
            public int compare(Object o1, Object o2){
                String s1 = String.valueOf((o1));
                String s2 = String.valueOf((o2));
                return s1.compareTo(s2);
            }
        }

        Collections.sort(nums, new SortComparator());

        System.out.println(nums);

        // 查找
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        Collections.replaceAll(nums, 10, 1);
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(Collections.frequency(nums, 1));
        Collections.sort(nums);
        System.out.println(Collections.binarySearch(nums, -5));
        System.out.println(Collections.binarySearch(nums, 1));


    }
}