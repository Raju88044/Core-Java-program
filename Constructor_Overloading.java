public class Constructor_Overloading {
    
    public static void main(String[] args) {
        
        Example exm = new Example();
        Example exm1 = new Example(10);
        Example exm2 = new Example("Raju");
        Example exm3 = new Example();
        System.out.println(exm1.a + " " + exm2.str);
        System.out.println(exm.a + " " + exm.str + " " +exm.age);
    }
}

class Example {

    int a;
    static String str;
    static short age;

    public Example() {
        this.age=12;
        System.out.println("In default Constructor");
    }
    public Example(int a) {
        this.a=a;
        System.out.println("In int param Constructor");
    }
    public Example(String str) {
        this(12,"Raju");
        this.str=str;
        System.out.println("In String param Constructor");
    }
    public Example(int a,String str) {
        super();
        this.str=str;
        //super(); super must be the 1st line of the methods.
        this.a=a;
        System.out.println("In int and String Param Constructor");
    }

    public static void show(){
        System.out.println("In Static show");
    }

}
