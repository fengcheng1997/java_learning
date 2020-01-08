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



