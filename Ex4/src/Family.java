import java.util.List;

public class Family {
    private String id;
    List<Person> members;

    public Family(String id, List<Person> members) {
        this.id = id;
        this.members = members;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", members=" + members +
                '}';
    }
}
