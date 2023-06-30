public class Main {
    public static void main(String[] args) {
        // Create course objects using factory
        Course course1 = CourseFactory.getCourse("CS101", "Computer Science", "4 years", "Prof. Smith");
        Course course2 = CourseFactory.getCourse("EE101", "Electrical Engineering", "4 years", "Prof. Johnson");

        // Assign course to students
        Student student1 = new Student("John", 20, "S1", "USA", "CS", course1);
        Student student2 = new Student("Alex", 22, "S2", "Canada", "EE", course2);
        Student student3 = new Student("Emma", 21, "S3", "UK", "CS", course1);

        // Print student details
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();
    }
}
