import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection_Map_example {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("Raju",60);
        map.put("Raju",61);
        map.put("Raj",60);

        System.out.println(map.keySet() +":" + map.entrySet() +":" + map.values());
        System.out.println(map.isEmpty());
        System.out.println(map);
        //map.g
        
        System.out.println("=====================================");
        Map<String,Integer> map1 = new HashMap<>();

        map1.put("Sonam",70);
        map1.put("Raju",60);

        System.out.println(map1);
        map1.put(null,null);

        map1.remove("98");
        System.out.println(map1.size());
        System.out.println(map1);
        System.out.println(map1.remove(null));

    }
}

