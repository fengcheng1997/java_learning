import java.util.*;

public class HomeworkOfMap {
    public static void main(String[] args) {
//        List<Student> list = new ArrayList<Student>(Arrays.asList(
        List<Student> list = new ArrayList<>(Arrays.asList( //最简单的写法，又不会提示不安全操作
//        List list = new ArrayList<>(Arrays.asList(
//        List list = new ArrayList(Arrays.asList(
//        List<> list = new ArrayList<>(Arrays.asList( //错误，上面都可以编译通过
                new Student("Bob", 78),
                new Student("Alice", 85),
                new Student("Brush", 66),
                new Student("Newton", 99)));
        System.out.println(list.get(0).getClass());
        Students holder = new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }
}

class Students {
    List<Student> list;
    Map<String, Integer> cache;

    Students(List<Student> list) {
        this.list = list;
        cache = new HashMap<>();
    }

    /**
     * 根据name查找score，找到返回score，未找到返回-1
     */
    int getScore(String name) {
        // 先在Map中查找:
        Integer score = this.cache.get(name);
        if (score == null) {
            // TODO:
            score = findInList(name);
            cache.put(name, score);
        }
        return score == null ? -1 : score.intValue();
    }

    Integer findInList(String name) {
        for (Student ss : this.list) {
            if (ss.name.equals(name)) {
                return ss.score;
            }
        }
        return null;
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
