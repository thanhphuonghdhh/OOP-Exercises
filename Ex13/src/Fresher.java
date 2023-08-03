import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{

    private LocalDate gradDate;
    private String gradRank;
    private String uniName;

    public Fresher(LocalDate gradDate, String gradRank, String uniName) {
        this.gradDate = gradDate;
        this.gradRank = gradRank;
        this.uniName = uniName;
    }

    public Fresher(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates, LocalDate gradDate, String gradRank, String uniName) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.gradDate = gradDate;
        this.gradRank = gradRank;
        this.uniName = uniName;
    }

    public LocalDate getGradDate() {
        return gradDate;
    }

    public void setGradDate(LocalDate gradDate) {
        this.gradDate = gradDate;
    }

    public String getGradRank() {
        return gradRank;
    }

    public void setGradRank(String gradRank) {
        this.gradRank = gradRank;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public void showInfo() {
        System.out.println("Fresher{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", graduation date='" + gradDate + '\'' +
                ", graduation rank='" + gradRank + '\'' +
                ", university name='" + uniName + '\'' +
                '}');
        getCertificates().forEach(s -> System.out.println(s.toString()));
    }
    public String getInfo() {
        return "Fresher{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", graduation date='" + gradDate + '\'' +
                ", graduation rank='" + gradRank + '\'' +
                ", university name='" + uniName + '\'' +
                '}';

    }
}
