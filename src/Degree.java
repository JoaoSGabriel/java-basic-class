public class Degree {
    private String universityName;
    private String course;
    private int period;

    public String getUniversityName() {
        return this.universityName;
    }

    public void setUniversityName(String universityName) {
        if(this.universityName != "") {
            return;
        }

        this.universityName = universityName;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        if(this.course != "") {
            return;
        }

        this.course = course;
    }

    public int getPeriod() {
        return this.period;
    }

    public void setperiod(int period) {
        if(this.period != 0) {
            return;
        }

        this.period = period;
    }
}
