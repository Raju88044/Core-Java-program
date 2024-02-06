import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

public class Collection_List_example {
    
    public static void main(String[] args) {
        Collection list = new ArrayList();

        list.add(60);
        list.add(98);
        //list allow duplicate value
        list.add(61);

       // list.add(list);

        System.out.println(list.isEmpty());
        System.out.println(list);

        //<data Type> is type safe called generic
        List<String> list1 = new ArrayList<String>();

        list1.add("raju");
        list1.add("6");
        list1.addAll(1,list);
        //System.out.println(list1.get(2));
        System.out.println(list1.indexOf(98));
        list1.set(0, "ram");
        System.out.println();
        System.out.println(list1);
        list1.add(null);

        list1.remove("98");
        System.out.println(list1.size());
        System.out.println(list1);
        System.out.println(list1.removeIf(null));


    }
}
