public class CandidateC extends Candidate{
    public static final String literature = "literature";
    public static final String history = "history";
    public static final String geography = "geography";

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + getId() + '\'' +
                ", name='" + getName()   + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() +'\'' +", subject="+
                literature + " " + history + " " +geography + '\'' +
                '}';
    }
}
