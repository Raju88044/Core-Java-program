public class MultiThreading_synchronize_Example {
    
    public static void main(String[] args) throws InterruptedException {
        Runnable obj = () -> {for(int i = 0; i <= 10000; i ++) Counter.counter();};
        Runnable obj1 = () -> {for(int i = 0; i <= 10000; i ++) Counter.counter();};

         Thread th = new Thread(obj);
         th.start();
         Thread th1 = new Thread(obj1);
         th1.start();

         th.join();
         th1.join();

         System.out.println(Counter.count);
    }
}

class Counter {
    static int count=0;
    public static synchronized void counter() {
        count++;
    }
}
