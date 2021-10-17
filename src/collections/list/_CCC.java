package collections.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class _CCC {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add(canonize("ABC"));
        set.add(canonize("BAC"));
        set.add(canonize("CAB"));
        set.add(canonize("CA"));

        System.out.println(set);

    }

    public static String canonize(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);


    }
}
