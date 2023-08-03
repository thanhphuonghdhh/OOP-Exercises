public class CandidateA extends Candidate{

    public static final String math = "math";
    public static final String physics = "physics";
    public static final String chemistry = "chemistry";
    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + getId() + '\'' +
                ", name='" + getName()   + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() +'\'' + ", subject="+
                math + " " + physics + " " +chemistry + '\'' +
                '}';
    }
}
