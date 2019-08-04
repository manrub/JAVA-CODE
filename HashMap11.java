import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashMap11 {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<Integer, String>();
        h.put(1,"manmohan");
        h.put(2,"Rahul");
        h.put(3,"Ramu");
        System.out.println(h);
        System.out.println(h.get(1));
        //find all key and values
        System.out.println(h.keySet());
        System.out.println(h.values());
        //check key or value is present and isempty
        System.out.println(h.containsKey(5));
        System.out.println(h.containsValue("rahul"));
        System.out.println(h.isEmpty());
        //putIfAbsent
        h.putIfAbsent(4,"ururu");
        System.out.println(h);
        //remove(key)
        h.remove(1);
        System.out.println(h);
        //replace value
        h.replace(2,"ruby");
        System.out.println(h);
        // entrySet return key and value pair
        for( Map.Entry<Integer,String> p : h.entrySet())
            System.out.println(p.getKey()+"            "+p.getValue());
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(1,2);
        if(h1.containsKey(1));
        h1.put(1,h1.get(1)+1);
        System.out.println(h1);
        HashMap<Integer,ArrayList<String>> n=new HashMap<>();

    }
}
