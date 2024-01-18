package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Comment {
    
    private Instant moment;
    private String author;
    private String content;

    public Comment() {
        this.moment = Instant.now();
    }

    public Comment(String author, String content) {
        this.moment = Instant.now();
        this.author = author;
        this.content = content;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return getMoment().atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")) + "\n"
        + getAuthor() + "\n" 
        + getContent() + "\n";
    }

}
