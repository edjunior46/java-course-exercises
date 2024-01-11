import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int varCombustivel = sc.nextInt();
        int varAlcool = 0;
        int varGasolina = 0;
        int varDiesel = 0;

        while (varCombustivel != 4) {
            switch (varCombustivel) {
                case 1:
                    varAlcool++;
                    break;
                case 2:
                    varGasolina++;
                    break;
                case 3:
                    varDiesel++;
                    break;
                default:
                    System.out.println("Código inválido");
            }

            varCombustivel = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", varAlcool, varGasolina, varDiesel);

        sc.close();

    }
}
