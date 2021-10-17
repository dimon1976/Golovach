package collections.list;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
