package week1.Service;

import java.util.ArrayList;

/**
 * Created by IT on 16.08.2016.
 */
public class Clients {

    private long idCode;
    private String name;
    private String tel;
    private ArrayList<Technics> technics = new ArrayList<Technics>();


    public Clients(long idCode, String name, String tel) {
        this.idCode = idCode;
        this.name = name;
        this.tel = tel;
    }

    public ArrayList<Technics> getTechnics() {
        return technics;
    }

    //сдать товар на ремонт
    public ArrayList<Technics> givTechnicsRepair(Clients clients, Technics technic){
        if (clients != null){
            technics.add(technic);
        }
        return null;
    }

    //забрать товар по идентификационному коду
    public void getTechnicsIdCode(long idCode){
        if (idCode != 0){
            for (int i = 0; i < technics.size() ; i++) {
                if (technics.get(i).getIdCode() == idCode){
                    if (technics.get(i).getStatusRepare() < 3){
                        System.out.println("Техника еще на ремонте в статусе " + StatusRepare.getStatusName(technics.get(i).getStatusRepare()));
                        return;
                    }
                    System.out.println("Оплата за ремонт " + technics.get(i).getRepairPrice());
                    technics.remove(i);
                }
            }
        }
        return;
    }

    public long getIdCode() {
        return idCode;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public void setTechnics(ArrayList<Technics> technics) {
        this.technics = technics;
    }
}
