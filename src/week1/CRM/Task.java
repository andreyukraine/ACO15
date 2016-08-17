package week1.CRM;

import java.time.LocalDateTime;

/**
 * Created by IT on 14.08.2016.
 */
public class Task {

    private String id;
    private String title;
    private Menager owner;
    private int status = StatusCodes.NEW;
    private LocalDateTime creationTime;
    private String description;
    private LocalDateTime workHours;
    private LocalDateTime closedTime;
    private Development executor;
    private Comment[] comments;

}
