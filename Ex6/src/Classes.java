import java.util.ArrayList;
import java.util.List;

public class Classes {

    List<Student> students;

    public Classes() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> showAge20() {
        List<Student> res = new ArrayList<>();
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getAge()==20) res.add(students.get(i));
        }
        if (res.isEmpty()) System.out.println("Empty");
        return res;
    }

    public List<Student> showAge23DN() {
        List<Student> res = new ArrayList<>();
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getAge()==23 && students.get(i).getAddress().equals("DN")) res.add(students.get(i));
        }
        if (res.isEmpty()) System.out.println("Empty");
        return res;
    }
}
