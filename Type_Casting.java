public class Type_Casting {
    
    public static void main(String[] args) {
        
        // Explicitily type casting
        int no = 234 ;
        byte bno = (byte)no ;

        // Implicitily type casting
        short sno = 34;
        int ino = sno;
        System.out.println(ino);

        //Type promotion
        short no1 = 103;
        short no2 = 340;
        int result = no1 * no2;

        System.out.println(result);
        System.out.println(bno);
    }
}
