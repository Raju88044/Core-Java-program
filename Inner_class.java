public class Inner_class {
    
    public static void main(String[] args) {
        
        System.out.println("In Main");

        Inner_class_example obj = new Inner_class_example();
        obj.show();

        //Inner class object declration
        Inner_class_example.Inner_Clss obj2 = obj.new Inner_Clss();

        obj2.show();
    }
}

class Inner_class_example {

    int num1 = 10;
    String name = "Raju";

    public void show() {
        System.out.println("In show");
    }

    //Inner class
    public class Inner_Clss {

        public void show() {
            System.out.println("Inner class show");
        }
    }
}
