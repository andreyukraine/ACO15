package week1.Service;

/**
 * Created by IT on 17.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        ServiseCentrer servise = new ServiseCentrer();
        servise.createServices("Apple","Кольцевая дорога 22","+388003434554");

        Director director = new Director(3,"Fedia","login3","director","+380",10000,"111222");
        Administrator administrator = new Administrator(2,"Sergiy","login1","admin","+380",7000,"654321");
        Worker worker = new Worker(1,"Andrey","login2","worker","+380",3000,"123456");

        director.hireEmployee(administrator);
        director.hireEmployee(worker);
        director.fireEmployee("login2");
        //director.viewAllEmployee();

        director.increaseSalary();

        Clients client = new Clients(77777777,"Client","+3808888888");
        Clients client1 = new Clients(88888888,"Client1","+38077777");

        Technics technics = new Technics(1,"phone",2000,0,client.getIdCode());
        Technics technics1 = new Technics(2,"radio",1000,0,client1.getIdCode());

        client.givTechnicsRepair(client,technics);
        client.givTechnicsRepair(client1,technics1);

        administrator.getTechnicsRepair(client);
        administrator.getTechnicsRepair(client1);

        administrator.takeTechnicSpecialist(client,worker);
        worker.repairTechnic(77777777,2);
        worker.returnTechnicsAdmin(88888888, 3);
        //administrator.viewAllClients();
        //client.getTechnicsIdCode(88888888);
    }
}
