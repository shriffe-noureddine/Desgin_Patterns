import java.util.HashMap;
import java.util.Map;

public class CourseFactory {
    private static Map<String, Course> courses = new HashMap<>();

    public static Course getCourse(String courseId, String courseName, String courseDuration, String courseProfessor) {
        Course result = courses.get(courseId);
        if(result == null) {
            result = new Course(courseId, courseName, courseDuration, courseProfessor);
            courses.put(courseId, result);
        }
        return result;
    }
}
