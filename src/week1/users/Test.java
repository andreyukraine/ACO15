package week1.users;

import java.util.Scanner;

/**
 * Created by IT on 06.08.2016.
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name ");
        String name = scanner.nextLine();

        System.out.print("Enter age ");
        int age = scanner.nextInt();

        System.out.print("Enter solary ");
        double solar = scanner.nextDouble();

        Company company = new Company("aco15");

        Users users = new Users(name,age,solar,company);


        company.addUser(users);


        company.showAllUsers(company.listUser);

    }


}
