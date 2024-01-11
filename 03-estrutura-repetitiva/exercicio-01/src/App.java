import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String passString = "222";

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha secreta: ");
        String varPassword = sc.nextLine();

        while (varPassword.intern() != passString.intern()) {
            System.out.print("Acesso negado. Tente novamente: ");
            varPassword = sc.nextLine();
        }

        System.out.println("Acesso permitido");

        sc.close();

    }
}
