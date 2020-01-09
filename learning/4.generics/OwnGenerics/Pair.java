public class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 静态泛型方法应该使用其他类型区分:
    public static <K> Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }

    public static void main(String[] args) {
        Pair pair = new Pair(1,2);
        System.out.println(pair.getFirst().getClass() + " and " + pair.getLast());

        Pair pair1 = new Pair("1","2");
        System.out.println(pair1.getFirst().getClass() + " and " + pair1.getLast());

        //output:
        //class java.lang.Integer and 2
        //class java.lang.String and 2
        //Pair会自动判断输入的类型,然后赋值T

//        Pair<Integer> pair2 = new Pair<Integer>("1",2); //错误
        Pair pair2 = new Pair("1",2);
        System.out.println(pair2.getFirst().getClass() + " and " + pair2.getLast().getClass() + " and " + pair2.getClass());
        //泛型里面的不同位置的T居然可以代表两种不同的类型

        //泛型方法
        Pair<Integer> pair3 = Pair.<Integer>create(new Integer(1), new Integer(2));
        System.out.println("pair3:" + pair3.getClass() + pair3.getLast().getClass());
    }
}