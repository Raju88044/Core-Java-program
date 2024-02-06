public class Upcasting_Downcasting {
    
    public static void main(String[] args) {
        System.out.println("Hello in Main");

        //UpCasting
        Upcast_Parent obj = new Upcast_Child();

//error: cannot find symbol obj.show1(); because variable obj of type Upcast_Parent
         //obj.show1();

         //DownCasting
         Upcast_Child obj1 = (Upcast_Child)obj;
         obj1.show1();

    }
}

class Upcast_Parent {

    public void show() {
        System.out.println("In Parent show");
    }
}
class Upcast_Child extends Upcast_Parent  {
    public void show1() {
        System.out.println("In Child show");
    }
}
