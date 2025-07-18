package Day4_SocialMedia;

import java.util.LinkedList;
import java.time.LocalDateTime;

abstract class Notification {
    protected String message;
    protected LocalDateTime timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public abstract void display();
}

class LikeNotification extends Notification {
    private String likedBy;

    public LikeNotification(String likedBy) {
        super(likedBy + " liked your post.");
        this.likedBy = likedBy;
    }

    public void display() {
        System.out.println("[Like] " + message + " at " + timestamp);
    }
}

class CommentNotification extends Notification {
    private String commenter;
    private String commentText;

    public CommentNotification(String commenter, String commentText) {
        super(commenter + " commented: \"" + commentText + "\"");
        this.commenter = commenter;
        this.commentText = commentText;
    }

    public void display() {
        System.out.println("[Comment] " + message + " at " + timestamp);
    }
}

class UserFeed {
    private LinkedList<Notification> notifications;

    public UserFeed() {
        notifications = new LinkedList<>();
    }

    public void addNotification(Notification notification) {
        notifications.addFirst(notification);
    }

    public void displayFeed() {
        if (notifications.isEmpty()) {
            System.out.println("No notifications.");
            return;
        }
        for (Notification n : notifications) {
            n.display();
        }
    }
}

public class SocialMedia {
    public static void main(String[] args) {
        UserFeed userFeed = new UserFeed();

        userFeed.addNotification(new LikeNotification("Alice"));
        userFeed.addNotification(new CommentNotification("Bob", "Nice photo!"));
        userFeed.addNotification(new LikeNotification("Charlie"));
        userFeed.addNotification(new CommentNotification("Dana", "Great post!"));

        System.out.println("User Notification Feed:");
        userFeed.displayFeed();
    }
}
