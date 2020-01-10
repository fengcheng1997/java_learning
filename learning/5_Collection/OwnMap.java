import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class OwnMap {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("Xiao Ming", s);
        Student target = map.get("Xiao Ming");
        System.out.println(target == s);
        System.out.println(target.score);
        Student another = map.get("Bob");
        System.out.println(another);

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("apple", 123);
        testMap.put("pear", 456);
        System.out.println(testMap.get("apple")); // 123
        testMap.put("apple", 789); // 再次放入apple作为key，但value变为789
        testMap.put("banana", 456);
        System.out.println(testMap.get("apple")); // 789
        System.out.println(testMap.get("banana").intValue() == testMap.get("pear").intValue());

        Student[] list = {
                new Student("Bob", 78),
                new Student("Alice", 85),
                new Student("Brush", 66),
                new Student("Newton", 99)};
////        Students holder = new Students(list);
//        System.out.println(list.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
//        System.out.println(list.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
//        System.out.println(list.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }
}

class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}