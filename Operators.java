public class Operators {
    public static void main(String[] args) {

        //Assignment operator
        int number1 = 21;
        int number2 = 3;

        //Arithematic operators
        int sum = number1 + number2 ;
        int sub = number1 - number2 ;
        int mul = number1 * number2 ;
        int div = number1 / number2 ;
        int rem = number1 % number2 ;
        System.out.println("ToTal sum is :"+ sum);
        System.out.println("ToTal sub is :"+ sub);
        System.out.println("ToTal mul is :"+ mul);
        System.out.println("ToTal div is :"+ div);
        System.out.println("Reminder is :"+ rem);
        // Post Increment opearators
        System.out.println(number1++);

        // Pre increment operators
        System.out.println(++number2);

        //Compound Assignment Operators
        int num1 = 12;
         num1 += 3;
         System.out.println("=============================");
         System.out.println(num1);
         num1 -= 3;
         System.out.println(num1);
         num1 *= 3;
         System.out.println(num1);
         num1 /= 3;
         System.out.println(num1);
         num1 %= 3;
         System.out.println(num1);
    }
}
