public class Wrapper_Class_Example {
    
    public static void main(String[] args) {
        
        System.out.println("Hello In Main");

        int a = 10;
        int b = 20;
        //The constructor Integer(int) is deprecated since version 9
        Integer num1 = new Integer(9);

        Integer num2 = 8;

        System.out.println(num1 + " " + num2);

        num1 = a; // AutoBoxing
//Java 5, autoboxing allows for automatic conversion 
//between primitive types and their corresponding wrapper classes

        num2=(Integer)(b);

        b = num2; // Auto Un-boxing
        a = num1.intValue();

        System.out.println(num1 + " " + b);

        //Runtime Exception - thread "main" java.lang.NumberFormatException: For input string: "12R"
        //String str_num1 = "12R";
        String str_num1 = "12";
        

        //Conerting String value to int
        Integer int_no1 = Integer.parseInt(str_num1);
        System.out.println(int_no1*12);

        Integer int_no2 = 15;
        // str_num2 will be replaces by int_no2
        String str_num2 = "Raju"; 
        str_num2 = Integer.toString(int_no2);

        System.err.println("String lenght is :"+str_num2.length());

        // Using Character.getNumericValue() to convert the char to an int
        char ch_no = '6';
        int c = Character.getNumericValue(ch_no);

        // Using arithmetic operation to convert the char to an int
        int d = ch_no - '0';
        System.out.println(c + "===" + d);

        // Converting Integer to char using type casting
        
        Integer nu1 = 128;
        char ch_no1 = (char) nu1.intValue();
        System.out.println(ch_no1);

        Integer int2 = 12;
        double d1 = int2.doubleValue();
        float f1 = int2.floatValue();
        short s1 = int2.shortValue();
        int i1 = int2.intValue();
    }
}
