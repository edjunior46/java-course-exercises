import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int varX = sc.nextInt();
        int varY = sc.nextInt();

        while (varX != 0 && varY != 0) {
            if (varX > 0 && varY > 0) {
                System.out.println("Q1");
            } else if (varX < 0 && varY > 0) {
                System.out.println("Q2");
            } else if (varX < 0 && varY < 0) {
                System.out.println("Q3");
            } else if (varX > 0 && varY < 0) {
                System.out.println("Q4");
            }
            varX = sc.nextInt();
            varY = sc.nextInt();
        }

        System.out.println("FIM");

        sc.close();

    }
}
