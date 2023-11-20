package collections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args){
        HashMap map = new HashMap<>();
        map.put("school","RCA");
        map.put("district","Nyabihnu");
        map.put("count",9);
        map.put("sector","Mukamira");
         String school = (String)map.get("school");
         int  count = (int)map.get("count");
        System.out.println("School:" + school + "Counts:"+count );
        System.out.println(map);
    }
}
