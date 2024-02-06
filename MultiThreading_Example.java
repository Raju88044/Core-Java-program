public class MultiThreading_Example {
    
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Hello hello = new Hello();
         //hi.show();
         hi.start();

         Thread.sleep(10);
         //hello.show();
         hello.start();

         //hi.setPriority(10);
         //hello.setPriority(Thread.MAX_PRIORITY);
         System.out.println(hello.getPriority());
    }
}

class Hi extends Thread {
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
}
