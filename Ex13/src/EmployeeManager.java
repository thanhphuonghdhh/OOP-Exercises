import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        boolean isExist = employees.stream().anyMatch(s -> s.getId().equals(employee.getId()));
        if (isExist) System.out.println("cannot insert employee with same id");
        employees.add(employee);

    }

    public boolean checkExist(String id) {
        return employees.stream().anyMatch(s -> s.getId().equals(id));
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
        switch (type) {
            case 0: {
                for (int i = 0; i < employees.size(); i++)
                    if (employees.get(i) instanceof Experience) list.add(employees.get(i));
                break;
            }
            case 1: {
                for (int i = 0; i < employees.size(); i++)
                    if (employees.get(i) instanceof Fresher) list.add(employees.get(i));
                break;
            }
            case 2: {
                for (int i = 0; i < employees.size(); i++)
                    if (employees.get(i) instanceof Intern) list.add(employees.get(i));
                break;
            }
        }
        return list;
    }

    public static void printFile(String s) throws IOException {
        FileWriter fileWriter = new FileWriter("src/Employee.txt",true);
        BufferedWriter b1 = new BufferedWriter(fileWriter);
        b1.write(s+String.format("%n"));
        b1.flush();


    }
}
