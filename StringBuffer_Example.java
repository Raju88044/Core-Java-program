public class StringBuffer_Example {
    public static void main(String[] args) {
        
        //StringBuffer is mutable and thread safe
        StringBuffer sb = new  StringBuffer("Raju ");
        System.out.println(sb.hashCode());
        sb.append(" Kumar");
        System.out.println(sb.hashCode());

        sb.insert(5,"Sah");
        System.out.println(sb);

    }
}
