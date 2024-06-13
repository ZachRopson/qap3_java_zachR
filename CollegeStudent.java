public class CollegeStudent extends Student {
    private String major; // e.g., "Electrical Engineering"
    private int year;     // current level in college

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public int getYear() { return year; }
    public String getMajor() { return major; }

    // Setter methods
    public void setYear(int year) { this.year = year; }
    public void setMajor(String major) { this.major = major; }

    public String toString() {
        return super.toString() + " year: " + year + " major: " + major;
    }
}

