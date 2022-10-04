package C_ObjectOriented.RelationsBtwClasses;

public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor){
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public void setCourseName(String courseName) {this.courseName = courseName;}
    public void setCode(String code) {this.code = code;}
    public void setInstructor(Instructor instructor) {this.instructor = instructor;}

    public String getCode() {return code;}
    public String getCourseName() {return courseName;}
    public Instructor getInstructor() {return instructor;}

    public double calcAverage(Student[] students){
        double average = 0;
        for (Student student : students)
            average += student.getNote();

        return average / students.length;
    }
}
