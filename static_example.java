import other.Package_example;
public class static_example {
    
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Example");
        
        Example exm = new Example();
        System.out.println(exm.a);
        System.out.println(exm.b);
        System.out.println(Example.b);

        //Using Package_example class method below

        Package_example obj = new Package_example();
        obj.add(23, 27);

    }
}

class Example{
    int a = 5;
    static int b = 5;

    static {
        System.out.println("In static block");
    }
    {
        System.out.println("In non-static block");
    }
    public void hello(String name) {
        a=8;
        b=9;
        System.out.println("Hello" + name);
    }
    public static void show(String name) {
       // a=7; we can't access non-static variable from static block/methods directly
        b=9;
        System.out.println("Hello" + name);
    }
}
