public class Types_Of_Interfaces_example {
    
    public static void main(String[] args) {
        
        System.out.println("In main");

        Normal obj = new implements_Of_Normal();
        obj.show();
        obj.run();
        Normal.ram();

        //Both will be call interface value
        System.out.println(obj.a);
        System.out.println(Normal.a);

        Functional obj2 = () -> System.out.println("In fuctional show");
        obj2.show();

        //we can't simple return a+b;
        Functional1 obj3 = (a,b) -> a+b;
        System.out.println(obj3.add(23,45));
    }
}

// Normal interfaces contain two or more methods
interface Normal{

    public static int a=90;
    void show();
    void run();
    public static void ram(){
        System.out.println("Ram");
    }
}
//Functional interface contain only one methods and eligible for lamda expression
@FunctionalInterface
interface Functional{
    void show();

    //void show1();
}
@FunctionalInterface
interface Functional1{
    int add(int num1,int num2);

    //void show1();
}
//Marker Interface doesn't contain any methods - Serializable,Cloneable,RandomAccess
interface Marker {

}

class implements_Of_Normal implements Normal {

    
    int b=10;

    @Override
    public void show() {
        System.out.println("In show of Implement class");
    }

    @Override
    public void run() {
        System.out.println("In run");
    }
}
