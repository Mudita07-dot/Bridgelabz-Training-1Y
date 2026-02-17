class Course {
    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
    }
}
