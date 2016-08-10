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


    public Subject(String name, int countHoursSemester) {
        this.name = name;
        this.countHoursSemester = countHoursSemester;
    }


    public void getByExam(){

    }

    public void informationAboutSubject(String name, Subject[] subjects){
        for (int i = 0; i < subjects.length ; i++) {
            if (name == subjects[i].name && subjects[i].name != null){
                System.out.println(subjects[i].name);
                break;
            }
        }
        //  System.out.println(String.format("name: %s, address: %s, subject: %s", "1", "1", "1"));
    }

    public void studentMarksSubject(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountHoursSemester() {
        return countHoursSemester;
    }

    public void setCountHoursSemester(int countHoursSemester) {
        this.countHoursSemester = countHoursSemester;
    }

}
