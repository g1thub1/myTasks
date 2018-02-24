package homework.l8.student;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String scienceWork) {
        super(firstName, lastName, group, avgMark);
        this.scienceWork = scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }
}
