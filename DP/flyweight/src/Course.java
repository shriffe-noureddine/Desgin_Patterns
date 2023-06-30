public class Course {
    private String courseId;
    private String courseName;
    private String courseDuration;
    private String courseProfessor;

    public Course(String courseId, String courseName, String courseDuration, String courseProfessor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseProfessor = courseProfessor;
    }

    // Getters
    public String getCourseId() { return this.courseId; }
    public String getCourseName() { return this.courseName; }
    public String getCourseDuration() { return this.courseDuration; }
    public String getCourseProfessor() { return this.courseProfessor; }
}
