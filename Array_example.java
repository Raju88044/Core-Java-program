public class Array_example {
    
    public static void main(String[] args) {
        
        // Simple 1D array with intialization
        int array[] = {12,4,56,78};

        for(int i = 0; i < 4; i ++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n==============================");
        // Assigning value at runtime or runtime array
        int runtime_array[] = new int[5];

        for(int i = 0; i < 5; i ++) {
            runtime_array[i]=(int)(Math.random() * 100);
        }
        for(int i = 0; i < 5; i ++) {
            System.out.print(runtime_array[i] + " ");
        }
    }
}
