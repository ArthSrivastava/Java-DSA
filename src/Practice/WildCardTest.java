package Practice;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());
        ArrayList<HRManager> hrManagers = new ArrayList<>();
        hrManagers.add(new HRManager());

        callWorkEmployee(accountants);
//        callWorkEmployee(hrManagers); // This is not possible
    }
    public static void callWorkEmployee(List<? extends Employee> employees) {
        for (Accountant e : (List<Accountant>) employees) {
            e.work();
        }
    }
}

class Employee {
    public void work() {
        System.out.println("Employee is working!");
    }
}

class Accountant extends Employee {
    @Override
    public void work() {
        System.out.println("Accountant is working!");;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HRManager is working!");
    }
}
