import java.util.ArrayList;

public class TuyenSinh {
    ArrayList<Candidate> candidates;

    public TuyenSinh() {
        candidates = new ArrayList<>();
    }

    public void add(Candidate c) {
        candidates.add(c);
    }
    public void showInfo() {
        candidates.forEach(s -> System.out.println(s.toString()));
    }

    public Candidate search(String id) {
        for (int i=0;i< candidates.size();i++) {
            if (candidates.get(i).getId().equals(id))
                return candidates.get(i);
        }
        return null;
    }
}
