import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee{
    private int year;
    private String skill;

    public Experience() {}

    public Experience(int year, String skill) {
        this.year = year;
        this.skill = skill;
    }

    public Experience(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates, int year, String skill) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.year = year;
        this.skill = skill;
    }

    @Override
    public void showInfo() {
        System.out.print("Experience{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", year='" + year + '\'' +
                ", skill='" + skill + '\'' +
                '}');
        if (!getCertificates().isEmpty())
        getCertificates().forEach(s -> System.out.println(s.toString()));
    }

    public String getInfo(){
        return "Experience{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", year='" + year + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
