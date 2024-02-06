public class Final_Example {
    
    public static void main(String[] args) {
        final String NAME = "Raju";
        System.out.println(NAME);
        //NAME = "Raj";  The final local variable NAME cannot be assigned
    }
}

// final class can't be a super class
//final class Parent {
    class Parent1 {

        // final methods can't be override in sub-class
    public final void showName(String name) {
        System.out.println(name);
    }
}

//The type Child1 cannot subclass the final class
class Child1 extends Parent1 {

    //Cannot override the final method from Parent1
    public void showName(String name) {
        System.out.println(name);
    }
}
