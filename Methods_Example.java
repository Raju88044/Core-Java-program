public class Methods_Example {
    public static void main(String [] args) {
        int num1 = 5;
        int num2 = 10;

        Calculator calc = new Calculator();
        System.out.println(calc.add(num1,num2));
        calc.playSong();
        String str = calc.buyPen(num2);
        System.out.println(str);

    }
}

class Calculator {
    //Method defination
    public int add(int a, int b) {
        return a + b;
    }
    public void playSong(){
        System.out.println("Song Played");
    }
    public String buyPen(int money) {
        if(money >= 10)
        return "Pen";

        return "Nothing";
    }
}
