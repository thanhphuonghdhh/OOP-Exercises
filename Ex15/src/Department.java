import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    private String name;
    List<Student> students;
    private int countRegular;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getCountRegular() {
        return countRegular;
    }

    public void setCountRegular(int countRegular) {
        this.countRegular = countRegular;
    }

    public Department() {
        students = new ArrayList<>();
    }

    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
        countRegular = 0;
    }

    public void add(Student student) {
        students.add(student);
        if (student instanceof RegularStudent) countRegular++;
    }

    //8
    public Student getMax() {
        double score = 0;
        Student res = new Student();
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getScore()>score) {
                score = students.get(i).getScore();
                res = students.get(i);
            }
        }
        return res;
    }

    //9
    public List<Student> getPlace(String place) {
        List<Student> res = new ArrayList<>();
        for (int i=0;i<students.size();i++) {
            if (students.get(i) instanceof InServiceStudent) {
                InServiceStudent inServiceStudent = (InServiceStudent) students.get(i);
                if (inServiceStudent.getPlace().equals(place)) res.add(inServiceStudent);
            }
        }
        return res;
    }

    //10
    public List<Student> getLastAvgScore() {
        List<Student> res = new ArrayList<>();
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getLastAvgScore() >= 8)
                res.add(students.get(i));
        }
        return res;
    }

    //11
    public Student getMaxAvgScore() {
        double max = 0;
        Student s1 = new Student();
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getMaxAvgScore() > max) {
                max = students.get(i).getMaxAvgScore();
                s1 = students.get(i);
            }
        }
        return s1;

    }

    //12
    public List<Student> sortByYear() {
        List<Student> list = students;
        Collections.sort(list, ((o1, o2) -> {
            return o2.getEnrolledYear() - o1.getEnrolledYear();
        }));
        return list;
    }

    //13
    public int getStudentNumberByYear(int year) {
        int number = 0;
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getEnrolledYear() == year)
                number++;
        }
        return number;
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
