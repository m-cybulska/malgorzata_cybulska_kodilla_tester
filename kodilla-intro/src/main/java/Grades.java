public class Grades {
    private double[] grades;
    private int size;
    private double latestGrade;
    private double averageGrade;

    public Grades() {
        this.grades = new double[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public double latestGrade() {
        this.latestGrade = grades[this.size - 1];
        return latestGrade;
    }
    public double averageGrade() {
        if (this.size == 0) {
            return 0.0;
        }
        double sum = 0.0;
        int numberOfGrades = this.size;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }
            return sum / this.size;

    }
}