package collections.iterators;

import java.util.Iterator;

public class Company implements Iterable<Employees> {
    private Employees[] employees = new Employees[0];

    public void setEmployees(Employees[] employees) {
        this.employees = employees;
    }
    @Override
    public Iterator<Employees> iterator() {
        return new ArrayIterator<>(employees);
    }


}
