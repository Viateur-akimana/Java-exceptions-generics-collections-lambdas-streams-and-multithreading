package com.codewithviateur.collections;

import java.util.*;
public class Methods {
    public static void main(String[] args){
        ArrayList district= new ArrayList();
        district.add("Nyabihu");
        district.add("Bugesera");
        district.add("Karongi");
        district.add(2,"Kicukiro");
        ArrayList<String> districts  = new ArrayList<>();
        districts.add("Kirehe");
        districts.add("Kayonza");
        districts.add("MUsanze");
        ArrayList<String> districts2  = new ArrayList<>();
        districts.add("Nyagatare");
        districts.add("Muhanga");
        districts.add("Ruhango");
         districts.addAll(districts2);
        districts.addAll(districts2);
        System.out.println("list:" + districts.size() + districts.contains(districts2));
        System.out.println("Lists: " + districts.get(1));
        System.out.println("LIsts: " + district.indexOf("Bugesera"));
        System.out.println("List:" + districts2.isEmpty());
        System.out.println("List:" + districts.hashCode());
        System.out.println("List:" + district.remove(1));
        System.out.println("List:" + districts.removeAll(districts2));
        System.out.println("List:" + district.size());
        System.out.println("list:" + district.set(0,"Huye"));
//        System.out.println("List:" + district.subList(1,3));
        System.out.println("Lists:" + districts.toArray());

    }
}
