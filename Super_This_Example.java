public class Super_This_Example {
    
    public static void main(String[] args) {
        
        Child ch = new Child();
        Parent ch1 = new Child(10);

        //Anonymsos object
        new Child().show();
        //java.lang.ClassCastException: class Parent cannot be cast to class Child
        //Child ch2 =  (Child)new Parent(10);
    }
}

class Parent {

    public Parent() {
        System.out.println("In Parent, default Constructor");
    }
    public Parent(int a ) {
        System.out.println("In Parent, Param Constructor");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("In Child, default Constructor");
    }
    public Child(int a ) {
        super(10);
        System.out.println("In Child, Param Constructor");
    }
    public static void show() {
        System.out.println("In show method");
    }
}