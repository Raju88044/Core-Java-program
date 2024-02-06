class MyException extends Exception {
    public MyException(String str) {
    super(str);
    }
    // public MyException() {
    //     }
    // @Override
    // public String getMessage(){
    //     return "This is my message";
    // }
}
public class Exception_example_Throw_Throws {
    
    public static void main(String[] args) {
        
        System.out.println("In main");
        int i = 200;
       int division=0;
       int arr[] = new int[5];
       String str=null;
       try{
            division = 100 / i;
            if(division==0)
            //throw new MyException();
            throw new MyException("You can't divide a number with smaller no");
            System.out.println(arr[3]);
            str.length();
       }
       catch(MyException ae) {
          System.out.println("The default value of your Division is:"+1 + ae);
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
