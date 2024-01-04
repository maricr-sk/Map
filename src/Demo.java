import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sarkar", 53);
        map.put("Evan", 12);
        map.put("Kevin", 25);
        map.put("Milind", 666);
        map.put("Aaron", 18);
        map.put("Christie", 4);
        map.put("Georgiy", 17);
        map.put("Spencer", 56);
        map.put("Andrew", 8);
        map.put("Brandon", 7);
        map.put("Marissa", 7);
        map.put("Aryan", 69);
        map.put("Gavin", 24);
        map.put("Savar", 12);
        //allowed to put null but if there are multiple names in a map it replaces them


        System.out.println(map);
        map.remove("Sarkar");

        System.out.println(map.get("Sarkar"));

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String nextKey = it.next();
            System.out.println(nextKey + ": " + map.get(nextKey));
        }

        Set <Integer> val = new HashSet<Integer>(map.values());
        Iterator<Integer> it2 = val.iterator();
        while(it2.hasNext()){
            System.out.println(it.next());
        }
    }
}
