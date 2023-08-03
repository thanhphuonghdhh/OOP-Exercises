public class CongNhan extends CanBo{
    private int level;
    public CongNhan(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level=level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", level='" + getLevel() + '\'' +
                '}';
    }
}
