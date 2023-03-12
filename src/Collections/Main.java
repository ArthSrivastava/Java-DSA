package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class main method!");
//        OurGenericList<Integer> list = new OurGenericList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        Iterator<Integer> iterator = list.iterator();

        //The for each loop is converted to this while loop
        //underneath
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for(int item: list) {
//            System.out.println(item);
//        }
//        NavigableSet<Integer> set = new TreeSet<>();
//        set.add(25);
//        set.add(21);
//        set.add(809);
//        set.add(39);
//        System.out.println(set);
//        System.out.println(set.ceiling(38));
//
//        Map<String, Integer> map = new HashMap<>();
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put("C", 3);
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        for(Map.Entry<String, Integer> entry: entrySet) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        NavigableMap<Integer, String> navigableMap = new TreeMap<>((a, b) -> b - a);
//        navigableMap.put(3, "C");
//        navigableMap.put(1, "A");
//        navigableMap.put(2, "B");
//        System.out.println(navigableMap);
//        System.out.println(navigableMap.ceilingKey(2));
//        System.out.println(navigableMap.higherKey(2));
//        Set<Map.Entry<Integer, String>> entries = navigableMap.entrySet();
//        for(Map.Entry<Integer, String> entry: entries) {
//            System.out.println(entry);
//        }

        Set<StudentMarks> studentMarks = new HashSet<>();
        studentMarks.add(new StudentMarks(98, 97));
        studentMarks.add(new StudentMarks(67, 45));
        studentMarks.add(new StudentMarks(78, 54));
        System.out.println(studentMarks.contains(new StudentMarks(98, 97)));
    }
}
