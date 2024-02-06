public class Abstract_class_Example {
   
    public static void main(String[] args) {
        
        System.out.println("In Main");

// we can't create object for abstract class but we can create ref variable of it
        Car obj = new TataEv();
        obj.drive();
        obj.music();
    }
}

//abstract class can have abstract or non-abstract methods or both
abstract class Car {

    //abstarct can be defined under abstract class
    public abstract void drive();

    public void music() {
        System.out.println("Music playing....");
    }
}

class TataEv extends Car {

    // Child class must have to define abstract methods from Parent class
    public void drive() {
        System.out.println("Driving");
    }
    
}
