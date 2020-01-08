//package classes.lsc.reflect;
//package sources.lsc.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class Phone {
    private int price;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) throws Exception{
        //正常的调用
        Phone phone = new Phone();
        phone.setPrice(5000);
        System.out.println("Phone Price:" + phone.getPrice());
        //使用反射调用
        Class clz = Class.forName("classes.lsc.reflect.Phone");
        Method[] methods = clz.getDeclaredMethods();
        for (Method method:methods){
            System.out.println("Method:" + method);
        }

        Constructor[] constructors = clz.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println("constructor:" + constructor);
        }

        Method setPriceMethod = clz.getMethod("setPrice", int.class);
        Constructor phoneConstructor = clz.getConstructor();
        Object phoneObj = phoneConstructor.newInstance();
        setPriceMethod.invoke(phoneObj, 6000);
        Method getPriceMethod = clz.getMethod("getPrice");
        System.out.println("Phone Price:" + getPriceMethod.invoke(phoneObj));
    }
}

