package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Main {

    public static void main(String[] args) {

        Institute institute = new Institute();

        Student student = new Student("Andrey","Kiev");

        Groupe groupe = new Groupe("ACO15", student);

        institute.addInstitut("KPI", 2, groupe);


        Subject subject = new Subject("Java", 10);
        Subject subject1 = new Subject("Php", 20);
        Subject subject2 = new Subject("C#", 30);



        student.addSubject(subject);
        student.addSubject(subject1);
        student.addSubject(subject2);

        //student.Study(student);
        //student.removeSubjectLast();

        student.getAverageScoreSubjects();
    }

}
