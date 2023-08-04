public class Result {
    private int semester;
    private double avgScore;

    public Result(int semester, double avgScore) {
        this.semester = semester;
        this.avgScore = avgScore;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Result{" +
                "semester=" + semester +
                ", avgScore=" + avgScore +
                '}';
    }
}
