public class Animal{
    private String name;
    private int id;

    public Animal(String myName, int myid){
        name = myName;
        id = myid;
    }

    public void eat(){
        System.out.println(name + "正在吃.");
    }

    public void sleep(){
        System.out.println(name + "正在睡.");
    }

    public void introduction(){
        System.out.println("大家好！我是" + id + "号" + name + '.');
    }

//    public static void main(String[] args)
    public static void main(String[] args){
        System.out.println("This is a Father class: Animal!");
        Penguin P = new Penguin("penny", 1);
//        Penguin.main();
        Mouse M = new Mouse("Mike", 2);
//        Mouse.main();
    }
}

class Penguin extends Animal{
    public Penguin(String myName, int myid){
        super(myName, myid);
    }

    public static void main(String[] args){
        System.out.println("This is a son class: Penguin!");
    }
}

class Mouse extends Animal{
    public Mouse(String myName, int myid){
        super(myName, myid);
    }

    public static void main(String[] args){
        System.out.println("This is a son class: Mouse!");
    }
}