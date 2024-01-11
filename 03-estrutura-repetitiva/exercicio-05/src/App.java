import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int varNum = sc.nextInt();
        int varIn = 0;
        int varOut = 0;

        for (int i = 0; i < varNum; i++) {
            int varX = sc.nextInt();
            if (varX >= 10 && varX <= 20) {
                varIn++;
            } else {
                varOut++;
            }
        }

        System.out.printf("in: %d%nout: %d%n", varIn, varOut);

        sc.close();

    }
}
