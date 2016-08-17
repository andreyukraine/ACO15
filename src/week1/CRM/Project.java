package week1.CRM;

/**
 * Created by IT on 14.08.2016.
 */
public class Project {

    private String id;
    private String title;
    private String description;
    private Project[] projects;
    private Menager[] manager;
    private Development[] developments;

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public Menager[] getManager() {
        return manager;
    }

    public void setManager(Menager[] manager) {
        this.manager = manager;
    }

    public Development[] getDevelopments() {
        return developments;
    }

    public void setDevelopments(Development[] developments) {
        this.developments = developments;
    }
}
