package week1.bank;

import java.util.Scanner;

/**
 * Created by IT on 07.08.2016.
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.createBank("Privat24",5);

        Invoce invoce = new Invoce();
        invoce.createInvoice(111111,0);

        Client client = new Client();
        client.create("Andrey",invoce);
        bank.add(client);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum pay ");
        int pay = scanner.nextInt();


    }
}
