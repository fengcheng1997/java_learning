//////class Animal {
//////  void eat() {
//////    System.out.println("animal : eat");
//////  }
//////}
//////
//////class Dog extends Animal {
//////  void eat() {
//////    System.out.println("dog : eat");
//////  }
//////  void eatTest() {
//////    this.eat();   // this 调用自己的方法
//////    super.eat();  // super 调用父类方法
//////  }
//////}
//////
//////public class Test {
//////  public static void main(String[] args) {
//////    Animal a = new Animal();
//////    a.eat();
//////    Dog d = new Dog();
//////    d.eatTest();
//////  }
//////}
//
// extends 使用向上转型不能使用子类的新方法，会报错
class Animal{
  public void move(){
    System.out.println("动物可以移动");
  }
}

class Dog extends Animal{
  public void move(){
    System.out.println("狗可以跑和走");
  }
  public void bark(){
    System.out.println("狗可以吠叫");
  }
}

public class Test{
  public static void main(String args[]){
    Animal a = new Animal(); // Animal 对象
    Animal b = new Dog(); // Dog 对象

    a.move();// 执行 Animal 类的方法
    b.move();//执行 Dog 类的方法
    b.bark();
  }
}
//
//// interface  子类可以创建新方法
//interface A {
//  public void eat();
////  public void sleep();
//}
//
//interface B {
//  public void show();
//}
//
//class C implements A,B {
//  public void eat(){};
//  public void show(){};
//
//  public void newBehavior(){
//    System.out.println("new method!");
//  };
//}
//
//
//public class Test {
//  public static void main(String args[]) {
//    C c = new C();
//
//    c.eat();
//    c.show();
//    c.newBehavior();
//
//  }
//}
//

//class A {
//  public void print() {
//    System.out.println("A:print");
//  }
//}
//
//class B extends A {
//  public void print() {
//    System.out.println("B:print");
//  }
//  public void funcB(){
//    System.out.println("funcB");
//  }
//}

//class C extends A {
//  public void print() {
//    System.out.println("C:print");
//  }
//  public void funcC(){
//    System.out.println("funcC");
//  }
//}
//
//public class Test{
//  public static void func(A a)
//  {
//    a.print();
//    if(a instanceof B)
//    {
//      B b = (B)a;   //向下转型,通过父类实例化子类
//      b.funcB();    //调用B类独有的方法
//    }
//    else if(a instanceof C)
//    {
//      C c = (C)a;  //向下转型,通过父类实例化子类
//      c.funcC();   //调用C类独有的方法
//    }
//  }
//
//  public static void main(String args[])
//  {
//    func(new A());
//    func(new B());
//    func(new C());
//  }
//}
