class MyAdd { 
            int count = 0; //成员变量计数器  
            static int sum = 0;//静态变量计数器  
            String name;
            MyAdd(String name){
                this.name = name; 
            }  
              
            public void myAddMethod() {    
                count++;  
                System.out.println(name+"调用成员变量后的值："+count);  
            }  
              
            public void staticAddMethod() {    
                sum++;  
                System.out.println(name+"调用类后变量的值："+sum);  
            }  
              
              
        }  
          
          
public class TestThis {  
          
            public static void main(String[] args) {  
                MyAdd add1 = new MyAdd("add1");
                MyAdd add2 = new MyAdd("add2");  
                  
                add1.myAddMethod();
                add2.myAddMethod();
                add1.myAddMethod();
                add1.staticAddMethod();
                add2.staticAddMethod();  
                add1.staticAddMethod();  
            }  
          
        }  
