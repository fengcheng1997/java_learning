import java.util.LinkedList;
import java.util.Queue;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.PriorityQueue;


public class OwnQueue{
//    Queue<String> q = new LinkedList<>();
    public static void main(String[] args) {
//        Queue<String> q = new LinkedList<String>();
//        q.add(new String("apple"));
//        q.offer("pear");
//        q.offer("banana");
//
//        // 队首永远都是apple，因为peek()不会删除它:
//        System.out.println(q.peek()); // apple
//        System.out.println(q.peek()); // apple
//        System.out.println(q.peek()); // apple
//
//        //poll会删除
//        System.out.println(q.poll()); // apple
//        System.out.println(q.poll()); // pear
//        System.out.println(q.poll()); // banana
//        System.out.println(q.poll()); // null,因为队列是空的

//    String lala = new String("lala");


        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空

        Queue<Integer> num = new PriorityQueue<Integer>(); //由小到大排列
        // 添加3个元素到队列:
        num.offer(2);
        num.offer(1);
        num.offer(3);
        System.out.println(num.poll()); // Boss/V1
        System.out.println(num.poll()); // Bob/A1
        System.out.println(num.poll()); // Alice/A2
        System.out.println(num.poll()); // null,因为队列为空

    }

}

class User {
    public final String name;
    public final String rank;

    public User(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return name + "/" + rank;
    }
}

class UserComparator implements Comparator<User>{
    public int compare(User u1, User u2){
        if (u1.rank.charAt(0) == (u2.rank.charAt(0))){
            return u1.rank.compareTo(u2.rank);
        }

        if (u1.rank.charAt(0) == 'V'){
            // V在A的前面
            return -1;
        }
        else{
            return 1;
        }
    }
}

