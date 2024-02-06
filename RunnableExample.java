public class RunnableExample {
    public static void main(String[] args) {

         Runnable obj = () ->
         {
            for(int i = 0; i <= 100; i ++) {
                System.out.println("Hi");
                try {Thread.sleep(10);} 
                catch (InterruptedException e) {e.printStackTrace();}
            }
         };
         Runnable obj1 = () ->
         {
            for(int i = 0; i <= 100; i ++) {
                System.out.println("Hello");
                try {Thread.sleep(10);} 
                catch (InterruptedException e) {e.printStackTrace();}
            }
         };
         Thread th = new Thread(obj);
         th.start();
         Thread th1 = new Thread(obj1);
         th1.start();
    }
}
/*
class Hi extends Hello implements Runnable {
    public void start() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class Hello extends Thread {
    public void start() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
} */

