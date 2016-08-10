package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Groupe {

    //    имя
    //    количество часов в семестре
    //    количество проработанных часов студентом
    //    оценка студента за предме

    //    методы:

    //    сдать экзамен
    //    показать информацию о предмете
    //    получить оценку студента за предмет



    private String name;
    private Student[] students = new Student[10];
    int i = 0;

    public Groupe(String name, Student student) {
        this.name = name;
        this.students[i++] = student;
    }


}
