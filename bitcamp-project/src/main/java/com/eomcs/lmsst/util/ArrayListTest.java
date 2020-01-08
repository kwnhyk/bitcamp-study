package com.eomcs.lmsst.util;

import java.util.ArrayList;

public class ArrayListTest{
public static void main(String[] args){
ArrayList<String> a1 = new ArrayList<>();

a1.add("aaa");
a1.add("bbb");
a1.add("ccc");
a1.add("ddd");
a1.add("eee");
a1.add("fff");


System.out.println(a1.get(2));

a1.remove(0);
System.out.println("----------------------");
System.out.println(a1.get(2));


}
static void print(ArrayList<String> arr){
    String[] list = new String[arr.size()];
    arr.toArray(list);
    for(String e:list){
        System.out.println(e);
    }
}



}