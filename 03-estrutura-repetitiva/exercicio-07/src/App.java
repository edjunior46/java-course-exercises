import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int varNum = sc.nextInt();

        for (int i = 1; i <= varNum; i++) {
            int iSqtr = i * i;
            int iCbrt = i * i * i;
            System.out.printf("%d %d %d%n", i, iSqtr, iCbrt);
        }

        sc.close();

    }
}
