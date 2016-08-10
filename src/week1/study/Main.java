package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Main {

    public static void main(String[] args) {

        Institute institute = new Institute();

        Student student = new Student();
        Groupe groupe = new Groupe("ACO", student);
        Subject subject = new Subject("Java", groupe, student);

        student.addStudent("Andrey","Kiev",subject);



        institute.addInstitut("KPI", 2, groupe);

        student.Study(student);


    }

}
