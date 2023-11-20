package collections;
import java.util.*;
public class Set {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Nyabihu");
        set.add("Gasabo");
        set.add("Rutsiro");
        set.add("Bugesera");
        set.add("Gasabo");
        set.add("Bugesera");
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
