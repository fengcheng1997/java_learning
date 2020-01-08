# 编译
#javac  -cp ./howtoingapp.jar Citate.java
#javac -cp .:howtoingapp.jar Citate.java
javac -cp howtoingapp.jar Citate.java
#运行
#java  -cp $CLASSPATH:./howtoingapp.jar Citate
java  -cp .:howtoingapp.jar Citate


#javac -cp howtoingapp.jar Citate.java
#java  -cp .:howtoingapp.jar Citate
#需要注意的几点是：
#1、编译的时候，需要使用-cp环境变量来引入外部jar的地址。-cp也可以换成-classpath。
#2、运行过程中，环境变量-cp中一定要加入编译时候生成的class文件的路径。并且用冒号分割。
