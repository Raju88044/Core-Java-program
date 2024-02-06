public class Multi_level_Inheritance extends Single_Inheritance_Calculator {
    
    public int getSquare(int base,int power) {
        int temp = power;
        int square = base;
        while(temp > 1) {
         square = square*base;
         temp--;
        }
        return square;
    }
}
