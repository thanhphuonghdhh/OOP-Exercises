import java.util.ArrayList;
import java.util.List;

public class Quarter {
    List<Family> families;

    public Quarter() {
        families = new ArrayList<>();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public void add(Family family) {
        families.add(family);
    }
}
