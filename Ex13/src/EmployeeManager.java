import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        employees.add(employee);
    }

    public Employee findByID(String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id))
                return employees.get(i);
        }
        return null;
    }

    public void deleteByID(String id) {
        Employee e = findByID(id);
        if (e == null) System.out.println("Cannot be deleted");
        else {
            employees.remove(e);
        }
    }

    public List<Employee> findByType(int type) {
        List<Employee> list = new ArrayList<>();
        if (type == 0) {
            for (int i = 0; i < employees.size(); i++)
                if (employees.get(i) instanceof Experience) list.add(employees.get(i));
        }
        else if (type == 1) {
            for (int i = 0; i < employees.size(); i++)
                if (employees.get(i) instanceof Fresher) list.add(employees.get(i));
        }
        else if (type == 2) {
            for (int i = 0; i < employees.size(); i++)
                if (employees.get(i) instanceof Intern) list.add(employees.get(i));
        }
        return list;
    }
}
