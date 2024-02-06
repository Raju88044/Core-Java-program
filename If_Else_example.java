import java.util.Scanner;

public class If_Else_example {
    
    public static void main(String[] args) {
         // Conditional statement
        System.out.println("Please Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextByte();
        sc.nextLine();

        System.out.println("Please Enter your Gender :");
        //String gender = sc.nextLine();
        char gender = sc.nextLine().charAt(0);


        if ( age >= 18  &&  gender == 'F') {// || gender == "Female")) {
            System.out.println("Congrasulations, You are eligibale for Marriage :)");
        }
        else if ( age >= 21 && gender == 'M') {//} || gender == "Male")) {
            System.out.println("Congrasulations, You are eligibale for Marriage :)");
        }
        else {
        System.out.println(":) Wait for sometime you time will come soon!");
        }
    }
}
