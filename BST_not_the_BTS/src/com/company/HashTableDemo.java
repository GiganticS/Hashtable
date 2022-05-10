package com.company;

public class HashTableDemo {
    public static void main(String[] args){
        HashTable<String> hm = new HashTable<String>(10);

        hm.put(11,"Yera");
        hm.put(12,"Nursultan");
        hm.put(13,"OLEG");
        System.out.println(hm.get(13));
    }
}
