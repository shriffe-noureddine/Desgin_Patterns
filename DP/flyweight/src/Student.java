public class Student {
    private String name;
    private int age;
    private String id;
    private String nationality;
    private String department;

    // Intrinsic (Shared) state
    private Course course;

    public Student(String name, int age, String id, String nationality, String department, Course course) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.nationality = nationality;
        this.department = department;
        this.course = course;
    }

    public void printStudentDetails() {
        System.out.printf("Student: %s, Age: %d, ID: %s, Nationality: %s, Department: %s\n", name, age, id, nationality, department);
        System.out.printf("Course ID: %s, Course Name: %s, Duration: %s, Professor: %s\n",
                course.getCourseId(), course.getCourseName(), course.getCourseDuration(), course.getCourseProfessor());
    }
}
