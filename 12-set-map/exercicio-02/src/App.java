import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //File file = new File(sc.nextLine());
        File file = new File("C:\\Users\\ed\\Workspace\\estudos-java\\curso-udemy\\#00 Projetos\\12-set-map\\exercicio-02\\in.csv");
        Map<String, Integer> candidates = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] lineSplit = line.split(",");
                if (candidates.containsKey(lineSplit[0])) {
                    candidates.put(lineSplit[0], (candidates.get(lineSplit[0]) + Integer.parseInt(lineSplit[1])));
                } else {
                    candidates.put(lineSplit[0], Integer.parseInt(lineSplit[1]));
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String str : candidates.keySet()) {
            System.out.println(str + " : " + candidates.get(str));
        }

        sc.close();

    }
}
