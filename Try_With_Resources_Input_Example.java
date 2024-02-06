import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_With_Resources_Input_Example {
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num;
        BufferedReader bf=null;
        System.out.print("Please enter any number:");
        try {
        InputStreamReader in = new InputStreamReader(System.in);
        bf = new BufferedReader(in);
        num= Integer.parseInt(bf.readLine());
        System.out.print(num);
        }
        finally {
            bf.close();
            System.out.println("1st stream resource closed");
        }

        //Try with Resources
        int num1;
        System.out.print("Please enter any number:");
        BufferedReader bf1 =null;
        try(BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in))) {
        num1= Integer.parseInt(bf2.readLine());
        System.out.print(num1);
        }
    }
}
