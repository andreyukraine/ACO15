package week1.users;

/**
 * Created by IT on 06.08.2016.
 */
public class Company {

    public Users[] listUser;
    public String name;


    public  Company(String name){
        listUser = new Users[5];
        this.name = name;
    }


    public void addUser(Users user) {
        int size = 0;
        while (size < 4) {
            user.setName(user.name + size);
            listUser[size] = user;
            size++;
        }
    }




    public void showAllUsers(Users[] listUser){
        if (listUser != null) {
            for (int i = 0; i < listUser.length; i++) {
                if (listUser[i] != null) {
                    System.out.println(listUser[i].getName() + " " + listUser[i].getAge() + " "
                            + listUser[i].getSolary() + " " + listUser[i].getCompany().name );
                }
            }
        }
    }

}
