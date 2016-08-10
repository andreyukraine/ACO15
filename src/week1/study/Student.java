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
    //    добавить предмет
    //    удалить предмет из списка последний
    //    показать всю информацию о предметах
    //    получить средний бал за все предметы




    private String name;
    private String address;
    private Subject subject;

    public void addStudent(String name, String address, Subject subject) {

        this.name = name;
        this.address = address;
        this.subject = subject;
    }

    public void Study(Student student){
        if (student !=null){
            System.out.println("Студент учит предмет" + subject);
        }
    }

    public void addSubject(String name, int countHoursSemester){

    }

    public void removeSubjectLast(){

    }

    public void getAverageScoreSubjects(){

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
