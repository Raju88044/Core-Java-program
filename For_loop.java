public class For_loop {
    
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.println(" ");
            for(int j = 1; j <= i; j ++) {
                System.out.print(j + " ");

            }
        }

        System.err.println();
        int i = 1;
        for(; ;) {
            if(i <= 5) {
            System.out.println(i);
            i++;
            }
            if(i == 6)
            break;
        }
    }
}
