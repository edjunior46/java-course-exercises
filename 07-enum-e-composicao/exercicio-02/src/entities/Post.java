package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Post {
    
    private Instant moment;
    private String title;
    private String content;

    private ArrayList<Comment> comments = new ArrayList<>();

    public Post() {
        this.moment = Instant.now();
    }

    public Post(String title, String content) {
        this.moment = Instant.now();
        this.title = title;
        this.content = content;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComments() {
        String result = "";
        for (int i = 0; i < comments.size(); i++) {
            result += comments.get(i).toString();
            result += "\n";
        }
        return result;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "POST" + "\n" 
        + getMoment().atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")) + "\n"
        + getTitle() + "\n" 
        + getContent() + "\n";
    }

}
