public class Method_Overloading {
    
    public static void main(String[] args) {

        Calculator1 calc = new Calculator1();
        Calculator1 calc1 = new Calculator1();
        System.out.println(calc.add(5, 6));

        
        System.out.println(calc.num1);
        System.out.println(calc1.num1);

        calc.num1 = 15;
        System.out.println(calc.num1);
        System.out.println(calc1.num1);
        
    }
}

class Calculator1 {
    int num1 = 10;
    //Method overloading
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    } 
    public int add(short a, int b) {
        return a + b;       
    } 
    public double add(short a, short b) {
        return a + b;
        
    }
}
