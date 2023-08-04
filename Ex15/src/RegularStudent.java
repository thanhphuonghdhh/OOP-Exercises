import java.time.LocalDate;
import java.util.List;

public class RegularStudent extends Student{


    public RegularStudent() {

    }

    public RegularStudent(String id, String name, LocalDate birthDay, int enrolledYear, double score, List<Result> results) {
        super(id, name, birthDay, enrolledYear, score, results);

    }

    public RegularStudent(Student student) {
        super(student);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
