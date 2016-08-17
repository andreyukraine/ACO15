package week1.CRM.Logic;

import week1.CRM.Development;
import week1.CRM.Project;
import week1.CRM.Task;

/**
 * Created by IT on 14.08.2016.
 */
public class BussinessLogicMetod {

    public static Project creatProject(long ownerID, String title, String description){
        return null;
    }

    public static Task creatorTask(long creatorId, String title, String description, long executorID, int workHours){
        return null;
    }

    public static boolean assignTask(String taskID, long executorID){
        return false;
    }

    public static Task[] filter(long executorID, long devID, String projectID, int statusCode, String startDate, String endDate){
        return null;
    }

    public static Task getTaskById(String taskId){
        return null;
    }

    public static boolean changeStatus(String taskId, int statusCode){
        return false;
    }
}
