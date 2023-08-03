import java.time.LocalDate;
import java.util.List;

public class InServiceStudent extends Student{

    private String place;

    public InServiceStudent() {

    }

    public InServiceStudent(String id, String name, LocalDate birthDay, int enrolledYear, double score, List<Result> results, String place) {
        super(id, name, birthDay, enrolledYear, score, results);
        this.place = place;
    }

    public InServiceStudent(Student student, String place) {
        super(student);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "InServiceStudent{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", enrolledYear=" + getEnrolledYear() +
                ", score=" + getScore() +
                "place='" + place + '\'' +
                ", results=" + results +
                '}';
    }
}
