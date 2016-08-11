package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Groupe {



    private String name;
    private Student[] students = new Student[10];
    int i = 0;

    public Groupe(String name, Student student) {
        this.name = name;
        this.students[i++] = student;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}
