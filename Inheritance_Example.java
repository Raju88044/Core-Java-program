public class Inheritance_Example {
    
    public static void main(String[] args) {
        Display dis = new Display();
        dis.greetings();
        dis.show();
        
    }
}
class Greetings {
    public void greetings()
    {
        System.out.println("Hello");
    }
}

class Display extends Greetings {

    public void show() {
    System.out.println("Hi");
    }

}
