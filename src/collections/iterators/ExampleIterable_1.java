package collections.iterators;

public class ExampleIterable_1 {
    public static void main(String[] args) {
        Company company = new Company();
        Employees[] employees = {new Employees("Mike"), new Employees("Sara"), new Employees("John")};
        company.setEmployees(employees);

//        Iterator<Employees> emp = company.iterator();
//        while (emp.hasNext()) {
//            System.out.println(emp.next());
//        }
        for (Employees emp : company) {
            System.out.println(emp.toString());
        }
    }
}
