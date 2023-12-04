package collections;
import java.util.*;
public class Lists {

    public static  void main(String[] args) {
//        HashSet<String> district = new HashSet<>();
//        district.add("gasabo");
//        district.add("Nyarugenge");
//        district.add("BUgesera");
//        district.add("Kicukiro");
//        district.add("Nyabihu");
//        district.add("Gasabo");
//        district.add("kicukiro");
//
//for (Object object:district){
////    Collections.sort(district);
//    System.out.println(district);
//}
        HashSet<String> districts=new HashSet<String>();
        districts.add("Gasabo");
        districts.add("Gasabo");
        districts.add("Bugesera");
        districts.add("Kicukiro");
        districts.add("Rubavu");
        districts.add("Kicukiro");
        districts.forEach(dis->{
//            Collections.sort(districts);
            System.out.println(dis);
        });

    }
}

