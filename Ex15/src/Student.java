import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private LocalDate birthDay;
    private int enrolledYear;
    private double score;
    List<Result> results;

    public Student() { results = new ArrayList<>();}
    public Student(String id, String name, LocalDate birthDay, int enrolledYear, double score, List<Result> results) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.enrolledYear = enrolledYear;
        this.score = score;
        this.results = results;
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.birthDay = student.birthDay;
        this.enrolledYear = student.enrolledYear;
        this.score = student.score;
        this.results = student.results;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getEnrolledYear() {
        return enrolledYear;
    }

    public void setEnrolledYear(int enrolledYear) {
        this.enrolledYear = enrolledYear;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public boolean isRegular() {
        if (this instanceof RegularStudent) return true;
        return false;
    }
    //6
    public double getAvgScoreBySemester(int sem) {
        for (int i=0;i<results.size();i++) {
            if (results.get(i).getSemester()==sem)
                return results.get(i).getAvgScore();
        }
        return 0;
    }

    //10
    public double getLastAvgScore() {
        return results.get(results.size()-1).getAvgScore();
    }

    //11
    public double getMaxAvgScore() {
        double max = 0;
        for (int i=0;i<results.size();i++) {
            if (results.get(i).getAvgScore() > max)
                max = results.get(i).getAvgScore();
        }
        return max;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", enrolledYear=" + enrolledYear +
                ", score=" + score +
                ", results=" + results +
                '}';
    }
}
