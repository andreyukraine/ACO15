package week1.Service;

/**
 * Created by IT on 16.08.2016.
 */
public class Director extends Administrator {
    public Director(int id, String name, String login, String status, String tel, int salary, String password) {
        super(id, name, login, status, tel, salary, password);
    }
    //нанять сотрудника
    public void hireEmployee(Worker worker){
        workers.add(worker);
    }
    public void hireEmployee(Administrator administrator){
        workers.add(administrator);
    }
    //уволить сотрудника
    public void fireEmployee(String login){
        for (int i = 0; i < workers.size() ; i++) {
            if (workers.get(i).getLogin().equals(login)){
                workers.get(i).setStatus("no working");
                return;
            }
        }
    }

    //посмотреть всех сотрудников
    public void viewAllEmployee(){
        for (int i = 0; i < workers.size() ; i++) {
            System.out.println(workers.get(i).getName());
        }
    }

    //увеличить зарплату сотрудникам на 10%
    public void increaseSalary(){
        for (int i = 0; i < workers.size(); i++) {
            workers.get(i).setSalary(workers.get(i).getSalary() + (workers.get(i).getSalary() * 0.1));
        }
    }
}
