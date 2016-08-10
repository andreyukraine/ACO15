package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Subject {

    //    имя
    //    количество часов в семестре
    //    количество проработанных часов студентом
    //    оценка студента за предме

    //    методы:

    //    сдать экзамен
    //    показать информацию о предмете
    //    получить оценку студента за предмет



    private String name;
    private int countHoursSemester;
    private int countWorkingHoursStudent;
    private int studentAssessmentSubject;
    private Student[] students = new Student[10];

    public Subject(String name, Groupe groupe, Student student) {
        int i = 0;
        this.name = name;
        this.students[i++] = student;
    }


    public void getByExam(){

    }

    public void informationAboutSubject(String name){
        for (int i = 0; i < students.length; i++) {
            if (name == students[i].getName()){
                System.out.println(String.format("name: %s, address: %s, subject: %s", students[i].getName(), students[i].getAddress(), students[i].getSubject()));
            }
        }
    }

    public void studentMarksSubject(){

    }
}
