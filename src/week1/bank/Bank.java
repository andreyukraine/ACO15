package week1.bank;

/**
 * Created by IT on 07.08.2016.
 */
public class Bank {

    public String nameBank;
    public Client[] count;
public Invoce[] invoces;


    public void createBank(String nameBank, int countClient){
        this.nameBank = nameBank;
        count = new Client[countClient];
    }

    public Bank add(Client client){
        Bank bank = new Bank();
        count[0]= client;
        return bank;
    }













}
