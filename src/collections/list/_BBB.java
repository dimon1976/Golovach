package collections.list;

import java.util.*;

public class _BBB {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String str0, String str1) {
//                System.out.println(str0 + ":" + str1);
                char[] ch0 = str0.toCharArray();
                char[] ch1 = str1.toCharArray();
                Arrays.sort(ch0);
                Arrays.sort(ch1);
                return new String(ch0).compareTo(new String(ch1));
            }
        });

        set.add("ABC");
        set.add("BAC");
        set.add("CAB");
        set.add("CA");

        System.out.println(set);
    }
}
