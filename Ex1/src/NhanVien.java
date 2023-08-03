public class NhanVien extends CanBo {
    public String work;

    public NhanVien(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work=work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", work='" + getWork() + '\'' +
                '}';
    }
}
