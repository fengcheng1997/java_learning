import java.util.LinkedList;
import java.util.Queue;


public class OwnQueue{
//    Queue<String> q = new LinkedList<>();
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add(new String("apple"));
        q.offer("pear");
        q.offer("banana");

        // 队首永远都是apple，因为peek()不会删除它:
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple

        //poll会删除
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // null,因为队列是空的

//    String lala = new String("lala");
    }

}