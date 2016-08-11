package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Student {

    //    Имя
    //    Адрес
    //    Предметы

    //    методы:

    //    учиться
    //    //добавить предмет
    //    //удалить предмет из списка последний
    //    //показать всю информацию о предметах
    //    //получить средний бал за все предметы




    private String name;
    private String address;
    private Subject[]subjects = new Subject[10];
    int i = 0;


    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }



    public void Study(Student student){
        if (student !=null){
            for (int i = 0; i < subjects.length; i++) {
                if (student.getSubjects()[i] == subjects[i]){
                    System.out.println("Студент учит предмет " + subjects[i].getName());
                }
            }
        }
    }

    public void addSubject(Subject subject){
        subjects[i++] = subject;
    }

    public void removeSubjectLast(){
        for (int j = subjects.length - 1; j > 1 ; j--) {
            if (subjects[j] != null) {
                subjects[j].setName(null);
                break;
            }
        }
    }

    public void getAverageScoreSubjects(Student student){
        int countSubject = 0;
        int scoreSubject = 0;
        for (int j = 0; (student.getSubjects()[j] != null) && (j < student.getSubjects().length); j++) {
                scoreSubject += student.getSubjects()[j].getStudentAssessmentSubject();
                countSubject++;
        }
        System.out.println(scoreSubject / countSubject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

}
