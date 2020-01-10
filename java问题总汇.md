# java问题总汇

## java基本程序结构
问题1：public static void main(String args[])里面的public,static,void,	main分别是啥意思

JAVA：public static void main(String args[]) 详解
https://www.cnblogs.com/dodocie/p/7439651.html

问题2：System.out.println()和System.out.print()区别
换行和不换行

问题3：位（bit）、字节（byte）、字符、编码之间的关系
https://blog.csdn.net/prdslf001001/article/details/78615823

问题4：FileOutputStream, OutputStreamWriter, BufferedWriter区别
https://blog.csdn.net/qq_34569497/article/details/80476042

问题5：为什么B继承的A时，总会先执行A的构造函数
java文件被编译成class文件时，在子类的所有构造函数中的第一行（第一个语句）会默认自动添加 super() 语句，在执行子类的构造函数前，总是会先执行父类中的构造函数。
另外：
java 里面只支持单继承，而且子类里面不可包含父类没有的方法。
如果想要多继承和包含新方法，只能用interface定义接口。

问题6：java中abstract和interface的区别
https://www.cnblogs.com/peifengyang/p/11411022.html

问题7：java中的向上转型和向下转型的作用
https://www.cnblogs.com/lifexy/p/10812841.html

问题8：java的多态和实现方法
https://blog.csdn.net/qq895627041/article/details/82109576
静态绑定和动态绑定

问题9：java中的package
https://blog.csdn.net/sinat_30973431/article/details/82386978
1.java中默认导入的包java.lang和当前文件夹的缺省包
2.包和包之间并不是包含关系.eg.当你导入java.awt.*时，会导入java.awt包中的所有类型，但它不会导入java.awt.color，java.awt.font或任何其他java.awt.xxxx包的所有类型。 如果你要使用java.awt.color中的类以及java.awt中的类，则必须同时导入导入这两个包：

问题10：如何获取java中的类
getClass()方法，也可以用getClass().getName()的到类名

问题11：java中的堆栈
https://www.cnblogs.com/qianjinyan/p/10352749.html
在函数中定义的一些基本类型的变量(8种)和对象的引用变量都是在函数的栈Stack内存中分配
堆Heap内存用于存放由new创建的对象和数组

问题12：公钥、私钥、数字签名和数字整数
https://blog.csdn.net/sum_rain/article/details/36897095
1.私钥加密，公钥解密；用于数字签名方向。私钥-公钥是一对一的关系，使用私钥加密的值，只能用对应的公钥解开，可以验证持有者身份（即私钥表示一个身份）。
2.公钥加密，私钥解密；用于数字信封方向。对方使用公钥加密的结果，只能用对应的私钥解开，可以发送给特定持有者一些私密的消息

比如说，我要给你发送一个加密的邮件。首先，我必须拥有你的公钥，你也必须拥有我的公钥。
      首先，我用你的公钥给这个邮件加密，这样就保证这个邮件不被别人看到，而且保证这个邮件在传送过程中没有被修改。你收到邮件后，用你的私钥就可以解密，就能看到内容。
      其次我用我的私钥给这个邮件加密，发送到你手里后，你可以用我的公钥解密。因为私钥只有我手里有，这样就保证了这个邮件是我发送的。
      当A->B资料时，A会使用B的公钥加密，这样才能确保只有B能解开，否则普罗大众都能解开加密的讯息，就是去了资料的保密性。验证方面则是使用签 验章的机制，A传资料给大家时，会以自己的私钥做签章，如此所有收到讯息的人都可以用A的公钥进行验章，便可确认讯息是由 A 发出来的了。

问题13：程序引用jar的编译和运行
javac -cp howtoingapp.jar Citate.java
java  -cp .:howtoingapp.jar Citate
需要注意的几点是：
1、编译的时候，需要使用-cp环境变量来引入外部jar的地址。-cp也可以换成-classpath。
2、运行过程中，环境变量-cp中一定要加入编译时候生成的class文件的路径。并且用冒号分割。

问题14：子类中重写是不是可以修改非借口函数的函数体？
是的

问题15：List list = new ArrayList(), 为什么要向上转型?
List是个接口，可以用来声明被绑定任一在该接口实现的对象。
上述代码中，list可以使用实现类ArrayList实现接口List中的属性和方法。如果需求改变，需要将ArrayList换成其他实现类（如LinkedList),只需要将上述代码改成List list = new LinkedList()就行了。因为LinkedList也实现了List中的方法，且有些实现和ArrayList不同。
https://blog.csdn.net/xiaohuo0930/article/details/91129023



问题16：接口和类的区别？
1.接口无法被实例化，但是可以被实现。
2.在Java中，接口类型可用来声明一个变量，他们可以成为一个空指针，或是被绑定在一个以此接口实现的对象。如问题15题中所述。
https://blog.csdn.net/weixin_43131464/article/details/83660555

问题17：为什么会出现注:“ xxx.java使用了未经检查或不安全的操作。 注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。”的情况
因为创建变量时泛型没有写清楚
//List<Student> list = new ArrayList<Student>(Arrays.asList(
  List<Student> list = new ArrayList<>(Arrays.asList( //最简单的写法，又不会提示不安全操作
//List list = new ArrayList<>(Arrays.asList(
//List list = new ArrayList(Arrays.asList(
//List<> list = new ArrayList<>(Arrays.asList( //错误，上面都可以编译通过
    new Student("Bob", 78),
    new Student("Alice", 85),
    new Student("Brush", 66),
    new Student("Newton", 99)));

问题18：java中的常用API（方法）的重写
Object中常用方法（无需继承、但需要重写）
toString()
equals()
hashCode()
https://www.cnblogs.com/wxywxy/p/6740277.html
常用接口及其常用方法（需要继承和重写）
Collection、Comparator和Comparable等等
https://blog.csdn.net/qq_35456686/article/details/81478450

