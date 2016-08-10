package week1.bank;

/**
 * Created by IT on 07.08.2016.
 */
public class Client {

    public String nameClient;
    public Invoce invoce;


    public void create(String nameClient, Invoce invoce){
        this.nameClient = nameClient;
        this.invoce = invoce;
    }

}
