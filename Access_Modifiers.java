public class Access_Modifiers {
   
    public static void main(String[] args) {
        System.out.println("hello");

        Example2 obj = new Example2();
        obj.show("Raju");
        //obj.age=10;  we can't access as this is private variable
        obj.city = "Patna";

    }

}

class Example2 {

    //private access modifier we can use only throught the class
    private int age;

    // Protected modifier we can use throught the package and from other packages
    // if it's have parent-child relatioship
    protected String city = "Hyderabad";

    //default modifier we can access throughout the package
    int num = 10;
    
    // Public modifier we can access from anywhere
    public void show(String name) {
        System.out.println("Hello Mr./Mrs." + name);
        age=30;
    }

}
