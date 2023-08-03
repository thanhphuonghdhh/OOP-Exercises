import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{
    private String major;
    private int semester;
    private String uniName;

    public Intern() {}

    public Intern(String major, int semester, String uniName) {
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public Intern(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates, String major, int semester, String uniName) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public void showInfo() {
        System.out.println("Intern{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", university name='" + uniName + '\'' +
                '}');
        getCertificates().forEach(s -> System.out.println(s.toString()));
    }

    public String getInfo() {
        return "Intern{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", university name='" + uniName + '\'' +
                '}';

    }
}
