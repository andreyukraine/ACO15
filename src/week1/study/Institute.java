package week1.study;

/**
 * Created by IT on 09.08.2016.
 */
public class Institute {

    private String name;
    private Groupe[] groupes;
    private Student[] students;


    public void addInstitut(String name, int countSubject, Groupe groupe){
        int i = 0;
        this.name = name;
        this.groupes = new Groupe[countSubject];
        this.groupes[i++] = groupe;
    }

}
