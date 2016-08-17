package week1.Service;

import java.util.ArrayList;

/**
 * Created by IT on 16.08.2016.
 */
public class Worker {

    private int id;
    private String name;
    private String login;
    private String position;
    private String status = "working";
    private String tel;
    private double salary;
    private String password;

    private ArrayList<Technics> technicsWorker = new ArrayList<Technics>();

    public void setTechnics(ArrayList<Technics> technics) {
        this.technicsWorker = technics;
    }




    public String getName() {

        return name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogin() {

        return login;
    }

    public Worker(int id, String name, String login, String position, String tel, double salary, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.position = position;
        this.tel = tel;
        this.salary = salary;
        this.password = password;
    }


    // ремонтировать технику
    public void repairTechnic(long idCode,int statusRepare){
        if (statusRepare < 3) {
            for (int i = 0; i < technicsWorker.size(); i++) {
                if (technicsWorker.get(i).getIdCode() == idCode) {
                    technicsWorker.get(i).setStatusRepare(statusRepare);
                }
            }
        }
        return;
    }

    //возвращать отремонтированную технику администратору
    public void returnTechnicsAdmin(long idCode,int statusRepare){
        if (statusRepare == 3) {
            for (int i = 0; i < technicsWorker.size(); i++) {
                if (technicsWorker.get(i).getIdCode() == idCode) {
                    technicsWorker.get(i).setStatusRepare(statusRepare);
                }
            }
        }
        return;
    }



}
