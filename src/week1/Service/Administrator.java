package week1.Service;

import java.util.ArrayList;

/**
 * Created by IT on 16.08.2016.
 */
public class Administrator extends Worker {

    double procentPriceRepair = 0.1;

    public Administrator(int id, String name, String login, String status, String tel, int salary, String password) {
        super(id, name, login, status, tel, salary, password);
    }

    ArrayList<Clients> clients = new ArrayList<Clients>();
    ArrayList<Worker> workers = new ArrayList<Worker>();

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    //взять на ремонт технику(цена ремонта = 10% от суммы товара)
    public void getTechnicsRepair(Clients client){
        if (client != null){
            clients.add(client);
            for (int i = 0; i < clients.size(); i++) {
                for (int j = 0; j < clients.get(i).getTechnics().size(); j++) {
                    clients.get(i).getTechnics().get(j).setRepairPrice(clients.get(i).getTechnics().get(j).getPrice() * procentPriceRepair);
                }
            }
            return;
        }
    }


    //посмотреть всех клиентов
    public void viewAllClients(){
        for (int i = 0; i < clients.size() ; i++) {
            if (clients.size() != 0){
                System.out.println(String.format("idCode: %d ,name: %s, tel: %s",
                        clients.get(i).getIdCode(),clients.get(i).getName(),clients.get(i).getTel()));
            }
        }
    }

    //передать технику специалисту по ремонту
    public void takeTechnicSpecialist(Clients clients, Worker worker){
                worker.setTechnics(clients.getTechnics());
    }


}
