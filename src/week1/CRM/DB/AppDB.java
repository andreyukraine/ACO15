package week1.CRM.DB;

import week1.CRM.Development;
import week1.CRM.Menager;
import week1.CRM.Project;
import week1.CRM.Task;
import week1.CRM.Utils.Array;

import java.time.LocalDate;

/**
 * Created by IT on 14.08.2016.
 */
public class AppDB {

//    private Project[] projects;
//    private int projectIndex;

    private Array projects;
    private Array manager;
    private Array devs;
    private Menager[] managers;
    private int devId;

    public Project addProject(Project project){
        String progectId = project.getTitle() + "-" + LocalDate.now().getDayOfMonth();
        project.setId(progectId);
        return project;
    }

    public Development addDev(Development development){
        return null;
    }


    public Menager addManager(Menager menager){
        return null;
    }

    public Project[] getProjects() {
        Object[] objects = projects.getAll();
        Project[] projects = new Project[objects.length];

        for (int i = 0; i < objects.length; i++) {
           projects[i] = (Project) objects[i];
        }
        return projects;
    }

    public Menager[] getManagers() {
        return managers;
    }

    public Project getProject(String projectId){
        Object[] objects = projects.getAll();
        for (int i = 0; i < objects.length; i++) {
            Object el = objects[i];
            Project project = (Project) el;

            if (project.getId().equals(projectId)){
                return project;
            }
        }
        return null;

    }

    public Task[] getAll(){
        return null;
    }

}
