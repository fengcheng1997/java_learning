public class FinalizationDemo {  
    public static void main(String[] args) {  
        Cake c1 = new Cake(1);  
        Cake c2 = new Cake(2);  
        Cake c3 = new Cake(3);  
          
        c2 = c3 = null;  
        System.gc(); //调用Java垃圾收集器
    }  
}  
  
class Cake extends Object {  
    private int id;  
    public Cake(int id) {  
        this.id = id;  
        System.out.println("Cake Object " + id + "is created");  
    }  
      
    protected void finalize() throws java.lang.Throwable {  // 多线程。Finalizer线程会和我们的主线程进行竞争，不过由于它的优先级较低，获取到的CPU时间较少，因此它永远也赶不上主线程的步伐。所以最后会发生OutOfMemoryError异常。
        System.out.println("Cake Object " + id + "hasn't been disposed"); 
        super.finalize();  
        System.out.println("Cake Object " + id + "is disposed");  
    // Cake Object 1is created
    // Cake Object 2is created
    // Cake Object 3is created
    // Cake Object 3hasn't been disposed
    // Cake Object 3is disposed


    //Cake Object 1is created
    //Cake Object 2is created
    //Cake Object 3is created
    //Cake Object 3hasn't been disposed
    //Cake Object 3is disposed
    //Cake Object 2hasn't been disposed
    //Cake Object 2is disposed

    //Cake Object 1is created
    //Cake Object 2is created
    //Cake Object 3is created
    //Cake Object 3hasn't been disposed
    
    }  
}
