import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private ArrayList<Student> students;
}

public Course(String courseName, String courseCode) {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.students = new ArrayList<>();
}


// Getter and Setter for courseName
public String getCourseName() {
    return courseName;
}

public void setCourseName(String courseName) {
    this.courseName = courseName;
}

// Getter and Setter for courseCode
public String getCourseCode() {
    return courseCode;
}

public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
}

// Getter for students list
public ArrayList<Student> getStudents() {
    return students;
}



// Add a student to the course
public void addStudent(Student student) {
    students.add(student);
}

// Remove a student from the course
public void removeStudent(Student student) {
    students.remove(student);
}

public class SchoolPractice {
    public static void main(String[] args) {
        // Create a new Course object
        Course javaCourse = new Course("Java 101", "J101");

        // Create a new Student object
        Student student1 = new Student("Your Name", 12345, 1, 4.0);

        // Add the student to the course
        javaCourse.addStudent(student1);

        // Print course details
        System.out.println("Course Name: " + javaCourse.getCourseName());
        System.out.println("Course Code: " + javaCourse.getCourseCode());
        System.out.println("Number of Students: " + javaCourse.getStudents().size());
    }
}