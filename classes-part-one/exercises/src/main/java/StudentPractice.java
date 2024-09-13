public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
    }
}

public class StudentPractice {
    public static void main(String[] args) {
        // Create a new Student object with your details
        Student student = new Student("Your Name", 12345, 1, 4.0);

        // Print out the student's information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Number of Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());
    }
}