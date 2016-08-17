package week1.CRM;

import java.time.LocalDateTime;

/**
 * Created by IT on 14.08.2016.
 */
public class Comment {

    private long id;
    private String title;
    private String message;
    private String owner;
    private LocalDateTime creationTime;
    private long creatorId;
    private Comment[] children;


}
