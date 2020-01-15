public class InnerClass {
    public static void main(String[] args) {
        System.out.println("下面是是内部类的程序展示");
        //创建外部类和内部类的方法有点不相同
        A a=new A();
        A.B b=new A().new B();
        a.say2();
        b.sayit();
        System.out.println("现在开始匿名内部类程序的编写\n");
        Chouxiang c=new Chouxiang() {
            String name="Geek Song too";
            public void say3()
            {
                System.out.println("这是匿名内部类当中的方法，重写了抽象类的方法");
                System.out.println(name);
            }
        };//在使用匿名内部类的时候，当这个类在陈述完之后，是需要打分号的。
        c.say3();
        System.out.println("我们来看看这个name到底是抽象类当中的name还是匿名内部类当中的"+c.name);//结果果然是父类当中的属性，和我们多态的性质相重合了
        //这就是所谓的向上转型。现在我们再来试试接口的匿名内部类实现
        Jiekou yui=new Jiekou() {
            @Override//由于必须实现接口当中的方法，因此计算机就自动为我们写上了override的标识符了
            public void say5() {
                System.out.println("这是继承的接口当中的方法");
            }
        };
    yui.say5();
    }
}
class A
{
    int waibu=12;
    public void say2()
    {
        System.out.println("这是外部类当中的方法");
    }
    class B
    {
        int neibu=13;
        public void sayit()
        {
            System.out.println("这是内部类里面的方法");
            System.out.println("使用内部类和外部类当中的数值进行想加的结果是"+(neibu+waibu));
            //之所以内部类可以使用外部类的属性是因为在创建对象的时候，已经给内部类的对象附加了一个外部类的对象，内部类的对象是建立在外部类对象的基础上的。
        }
    }
}
//虽然内部类的程序已经成功了，但是匿名内部类的程序还没有成功，现在我们来创建一个匿名内部类(在主方法当中,首先应该创建一个抽象类或者接口)
abstract class Chouxiang
{
    String name="Geek Song";//抽象类的属性是不会被调用的，除了方法
public void say3()
{
    System.out.println("这是抽象类当中的方法,抽象类当中是允许有具体方法来进行实现的，接口不行");
}

}
interface Jiekou
{
    public void say5();

}
