public class Logical_Operators {
    public static void main(String[] args) {
        
        short num1 = 10;
        byte num2 = 5;
        //comparison operators
        boolean decision = num1 > num2 ;
        boolean decision1 = num1 < num2 ;
        System.out.println(decision);
        System.out.println(decision1);
        System.out.println("=============");
        System.out.println(!(num1 > num2));
        System.out.println(!(num1 == num2));
        System.out.println(((num1 >= num2)));
        {System.out.println(((num1 <= num2)));}

        //logical operators
        System.out.println("Logical starts from here:");
        int no1 = 10;
        short no2 = 20;
        boolean dec = no1 > no2 && no1 == no2;
        System.out.println(dec);
        System.out.println(no1 > no2 || no1 < no2);
        System.out.println(no1 > no2 != no1 > no2);
    }
}
