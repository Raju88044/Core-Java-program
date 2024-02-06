public class Exception_example {
    
    public static void main(String[] args) {
       System.out.println("In main"); 

       int i = 2;
       int division=0;
       int arr[] = new int[5];
       String str=null;
       try{
            division = 100 / i;
            System.out.println(arr[3]);
            str.length();
       }
       catch(ArithmeticException ae) {
        System.out.println("You can't divide by 0");
       }
       catch(ArrayIndexOutOfBoundsException aie) {
        System.out.println("it's beyond limit");
       }
       catch(Exception e) {
        System.out.println("Something went wrong...!!!");
       }

       System.out.println(division);

       System.out.println("End of the program");
    }
}
