package golovach.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Arrays.asList;

public class ListExample {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Sara", "Ted", "Mick");
//
//        for (String value : list) {
//            System.out.println(value);
//        }
//        String a = "Test";
//        String b = "Test";
//        boolean result = a == b;
//        System.out.println(result);
//        List list = asList("A","B","A","AB","B");
//        System.out.println(new HashSet(list).size()); // выводим количество или значения уникальных значений

//        ArrayList<User> arrays = new ArrayList<User>();
//        arrays.add(new User(25, "Mike"));
//        arrays.add(new User(18, "Nike"));
//        arrays.add(new User(31, "Pike"));
//        arrays.add(new User(10, "Rose"));
//        Arrays.sort(arrays, User.BY_NAME);
//        System.out.println(arrays);

        List<String> list = new ArrayList<>(asList("A", "B", "C", "A", "B"));
        System.out.println(list);
        Map<String, Integer> map = toStatMap(list);
        System.out.println(map);
        System.out.println("MAX value = " + new TreeSet<>(map.values()).last());
//        System.out.println("MAX value = " + new TreeSet<>(map.entrySet()));

        TreeSet<Map.Entry<String, Integer>> entries = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() { //Сортируем по Value
            @Override
            public int compare(Map.Entry<String, Integer> entry0, Map.Entry<String, Integer> entry1) {
//                return entry0.getValue()-entry1.getValue();
                int delta = entry0.getValue() - entry1.getValue();
//                System.out.println(delta);
                return (delta != 0) ? delta : entry0.getKey().compareTo(entry1.getKey());
            }
        });
        entries.addAll(map.entrySet()); //Добавляем отсортированные значения
        TreeMap<String, Integer> tmp = new TreeMap<>();  //Временный массив из одного элемента для границы вырезания
        tmp.put("" + (char) 0, entries.last().getValue());  // Находим границу
        Map.Entry<String, Integer> edge = tmp.entrySet().iterator().next(); // Заносим границу
        System.out.println(entries.tailSet(edge, true)); // Выводим вырезанные значения

        System.out.println(entries.last());  // Выводим последний (MAX) entrySet
    }


    private static Map<String, Integer> toStatMap(List<String> list) {  //Вынесли заполнение мапы из листа в отдельный метод
        Map<String, Integer> map = new HashMap<>();
        for (String key : list) {
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }
//                        map.put(key, map.get(key) == null ? 1 : map.get(key) + 1); // Запись в одну строчку
        }
        return map;
    }
}
