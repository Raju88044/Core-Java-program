public class String_Example {
    
    public static void main(String[] args) {
        
        String str = new String();
        System.out.println(str.hashCode());

        String str1 = new String("Raju");
        System.out.println(str1.hashCode());
        //String is immutable or unchangeable
        String str2 = "Kumar";
        System.out.println(str2.hashCode());
        System.out.println(str2);

        String str3 = "Kumar";
        System.out.println(str3.hashCode());
        System.out.println(str3);
        System.out.println(str3.charAt(3));
        System.out.println(str3.equalsIgnoreCase("Raju"));
        System.out.println(str3.compareTo("Kumar"));
        System.out.println(str3.toUpperCase());
    }
}
