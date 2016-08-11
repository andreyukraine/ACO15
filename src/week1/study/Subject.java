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


    public Subject(String name, int countHoursSemester, int countWorkingHoursStudent, int studentAssessmentSubject) {
        this.name = name;
        this.countHoursSemester = countHoursSemester;
    }

    public void getByExam(Student student, Subject subject, int studentAssessmentSubject){
            if (studentAssessmentSubject != 0){
                this.studentAssessmentSubject = studentAssessmentSubject;
            }
    }

    public void informationAboutSubject(String name, Subject[] subjects){

        for (int i = 0; i < subjects.length ; i++) {
            if (name == subjects[i].name && subjects[i].name != null){
                System.out.println(String.format("предмет: %s, количество часов в семестре : %s, количество проработанных часов студентом : %s, оценка студента за предме: %d",
                        subjects[i].name, subjects[i].countHoursSemester, subjects[i].countWorkingHoursStudent, subjects[i].studentAssessmentSubject));
                break;
            }
        }

    }



    public void studentMarksSubject(Student student, Subject subject, Student[] students, Subject[] subjects){
        for (int i = 0; i < students.length ; i++) {
            if (students[i].getName() == student.getName()){
                System.out.print(student.getName() + " ");
                for (int j = 0; j < subjects.length ; j++) {

                    if (subjects[j].getName() == subject.getName()){
                        System.out.print("оценка студента за предмет " + subject.getName() + " " +  subject.getStudentAssessmentSubject());
                    }
                }
//                System.out.println(String.format("оценка студента за предме: %d", students[i].getName() ));
                break;
            }
        }


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

    public int getStudentAssessmentSubject() {
        return studentAssessmentSubject;
    }

    public void setStudentAssessmentSubject(int studentAssessmentSubject) {
        this.studentAssessmentSubject = studentAssessmentSubject;
    }

    public int getCountWorkingHoursStudent() {
        return countWorkingHoursStudent;
    }

    public void setCountWorkingHoursStudent(int countWorkingHoursStudent) {
        this.countWorkingHoursStudent = countWorkingHoursStudent;
    }
}
