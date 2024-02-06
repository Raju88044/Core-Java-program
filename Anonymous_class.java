public class Anonymous_class {
    
    public static void main(String[] args) {
        
        System.out.println("In main");

        Anonymous_class_example obj = new Anonymous_class_example()
        {            
            public void show() {
                System.out.println("In Anonymous class show method ");
            }
        };
        obj.show();
    }
}
abstract class Anonymous_class_example {

    int num1 = 10;
    String name = "Raju";

    public abstract void show();
}
