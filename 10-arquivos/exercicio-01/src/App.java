import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\ed\\Workspace\\estudos-java\\curso-udemy\\#00 Projetos\\10-arquivos\\in.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            String line = br.readLine();
            
            while (line != null) {
                System.out.println(line);              
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
