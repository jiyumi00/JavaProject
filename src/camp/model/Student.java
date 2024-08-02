package camp.model;

import java.util.ArrayList;

public class Student {
    private String studentId;
    private String studentName;
    private ArrayList<Subject> subjects;

    public Student(String seq, String studentName, ArrayList<Subject> subjects) {
        this.studentId = seq;
        this.studentName = studentName;
        this.subjects=subjects;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Subject> getSubjects(){
        return subjects;
    }

}
