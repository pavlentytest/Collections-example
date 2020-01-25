package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Коллекции в Java
            1) Set - множества
            2) List - списки
            3) Map - словарь (карта)

            1) В Set можно добавить элемент, его поискать или удалить.
            Там не строго порядка.
            2) Пример. Пары обуви вдоль стенки - выставлены в
            определенном порядке. У каждой пары обуви есть свой номер (индекс).
            3) Пример. У каждой пары обуви теперь есть имя "Иван", "Петр" и т.д.
            Пары обуви - это элемент мапа. По имени можно обращаться
            к элементу. Имя - оно уникально. Маp - это набор пар "Ключ" - имя,
            "Значение" - то что там хранится.

            Чтобы узнать количество - size();

            В Java:
            Set-ы:  HashSet, TreeSet, SortedSet
            List-ы: ArrayList, LinkedList, Vector, Stack
            Map-ы: HashMap, TreeMap, SortedMap, Hashtable


        */

        Set<String> set =  new HashSet<>();
        set.add("MMM");
        set.add("HHHH");
        set.add("RRRRR");
        set.add("1111");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String txt = iterator.next();
            System.out.println(txt);
        }
        for(String text: set) {
            System.out.println(text);
        }


        Map<String,String> map = new HashMap<>();
        map.put("first","Cat");
        map.put("second","Dog");
        map.put("third","Aaaa");

        Iterator<Map.Entry<String,String>>
                iterator1 = map.entrySet().iterator();
        while(iterator1.hasNext()) {
            Map.Entry<String,String> pair = iterator1.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ": " + value);
        }


            String abc = "adgfadgadfg";
        System.out.println(abc.hashCode());




    }
}
