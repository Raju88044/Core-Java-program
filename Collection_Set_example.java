import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Collection;

public class Collection_Set_example {
    
    public static void main(String[] args) {
        Collection set = new HashSet();

        set.add(60);
        set.add(98);
        //set doesn't allow duplicate value
        set.add(61);

       // set.add(set);

        System.out.println(set.isEmpty());
        System.out.println(set);

        //<data Type> is type safe called generic
        Set<String> set1 = new HashSet<String>();

        set1.add("raju");
        set1.add("6");
        set1.addAll(set);
        //System.out.println(set1.get(2));
        set1.add("ram");
        System.out.println();
        System.out.println(set1);
        //set1.add(null);

        set1.remove("98");
        System.out.println(set1.size());
        System.out.println(set1);
        //System.out.println(set1.removeIf(null));

        Iterator list = set.iterator();
        //list.g

        while(list.next() != null){
            System.err.println("hello"+list.hasNext());
        }

    }
}

