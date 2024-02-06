import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_Example {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(12,45,34,56,3);
        System.out.println((list));

        Stream<Integer> st1 = list.stream();
        Stream<Integer> st2= st1.filter(n -> n%2==0);
        Stream<Integer> st3= st2.map(n -> n*2);
        int results = st3.reduce(0, (c,e)->(c+e));
        
        System.out.println(results);

        List<Integer> list1 = Arrays.asList(12,45,34,56,3);
        System.out.println((list1));

        
        int stm1 = list1.stream()
                                .filter(n -> n%2==0)
                                .map(n -> n*2)
                                .reduce(0, (c,e)->(c+e));
        
        System.out.println(stm1);
    }
}
