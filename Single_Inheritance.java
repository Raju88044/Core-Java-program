public class Single_Inheritance {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Access the Calculator!!!");
        Single_Inheritance_Calculator obj1 = new Single_Inheritance_Calculator();
        System.out.println(obj1.add(10,12));
        System.out.println(obj1.sub(20,12));
        System.out.println(obj1.mul(10,7));
        System.out.println(obj1.div(10,2));

        Multi_level_Inheritance obj2 = new Multi_level_Inheritance();
        System.out.println(obj2.add(10,12));
        System.out.println(obj2.sub(20,12));
        System.out.println(obj2.mul(10,7));
        System.out.println(obj2.div(10,2));
        System.out.println(obj2.getSquare(4,5));
    }
    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int sub(int num1, int num2) {
        return num1-num2;
    }
}
