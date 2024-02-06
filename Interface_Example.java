public class Interface_Example {
    
    public static void main(String[] args) {

        Interface1 obj  = new Interface_Im();

        obj.show();
       
        System.out.println("Hello");

        Interface1 inf_obj = new Interface1()
        {

            {
                show();
            }
            public void show() {
                System.out.println("Hello brother");
            }

        };
    }
}

interface Interface1{
    
    //By default variables are final in interface
    String name ="Raju";
    int age = 24;

    //By default methods are abstarct in interface
    void show();
}

interface Interface2 extends Interface1 {

    void show();
}

class Interface_Im implements Interface1,Interface2 {

    public void show() {
        System.out.println("show methods");
    }
    
}
