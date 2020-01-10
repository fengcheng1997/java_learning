import java.util.Arrays;
//import java.lang.Comparable;

public class GenericsInterface  {
    public static void main(String[] args){
        String[] ss = new String[] {  "Orange", "Apple", "Pear"};
        Arrays.sort((ss));
        System.out.println(Arrays.toString(ss));

        //String 实现了Comparable<String>接口，所以可以用Arrays.sort(Object[])方法

        Person[] ps = new Person[]{
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75)
        };

        Arrays.sort(ps);

        System.out.println(ps[0].toString().getClass());
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person> {
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name + ":" + this.score;
    }
    //修改toString方法，因为Array.toString()里调用T.toString()，
    // 最后形式是[T1.toStinrg(), T2.toStinrg(), T3.toStinrg(), ...]
}


//public interface Comparable<T> {
//    /**
//     * 返回-1: 当前实例比参数o小
//     * 返回0: 当前实例与参数o相等
//     * 返回1: 当前实例比参数o大
//     */
//    int compareTo(T o);
//}
