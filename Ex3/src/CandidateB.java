public class CandidateB extends Candidate{
    public static final String math = "math";
    public static final String chemistry = "chemistry";
    public static final String biology = "biology";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateB{" +
                "id='" + getId() + '\'' +
                ", name='" + getName()   + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() +'\'' +", subject="+
                math + " " + chemistry + " " +biology + '\'' +
                '}';
    }
}
