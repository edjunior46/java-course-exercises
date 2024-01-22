import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        File file = new File(sc.nextLine());
        
        File out = new File(file.getParent() + "\\out");
        if (!out.exists()) {
            out.mkdir();
        }
        
        File outFile = new File(out + "\\out.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            
            String line = br.readLine();
            
            if (!outFile.exists()) {
                outFile.createNewFile();
            }

            while (line != null) {
                String[] productString = line.split(",");
                Product product = new Product(productString[0], Double.parseDouble(productString[1]), Integer.parseInt(productString[2]));
                bw.write("Name: " + product.getName() + " - Total: $" + product.total());
                bw.newLine();
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
