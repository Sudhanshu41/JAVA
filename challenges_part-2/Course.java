public class Course {
    String courseName;
    int enrolledStudents;
    static int maxCapacity;
    String [] enrolledStudentsName ;
    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents =0;
        this.enrolledStudentsName =  new String[maxCapacity];
    }
    static{
        maxCapacity = 100;

    }
    void enrollStudent(String studentName){
        enrolledStudentsName[enrolledStudents] = studentName;
        enrolledStudents++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
    }
    static void setMaxCapacity(int Capacity){
        Course.maxCapacity = Capacity;
    }
}
