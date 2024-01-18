import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        Post post1 = new Post("Traveling to New Zealand", "Im going to visit this wonderful country!");
        Post post2 = new Post("Good night guys!", "See you tomorrow");

        post1.addComment(new Comment("Jeca", "Have a nice trip"));
        post1.addComment(new Comment("Juca", "This is awesome"));

        post2.addComment(new Comment("Jica", "Good night"));
        post2.addComment(new Comment("Will", "Have nice dreams"));

        System.out.println(post1);
        System.out.println(post1.getComments());
        System.out.println(post2);
        System.out.println(post2.getComments());

    }
}
