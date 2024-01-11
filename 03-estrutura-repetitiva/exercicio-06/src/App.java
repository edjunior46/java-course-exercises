import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int varNum = sc.nextInt();
        int varFact = varNum;

        for (int i = varFact; i > 1; i--) {
            varFact *= (i - 1);
        }

        if (varFact == 0) varFact ++;

        System.out.println(varFact);

        sc.close();

    }
}
