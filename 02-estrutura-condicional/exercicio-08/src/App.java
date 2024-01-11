import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para representar um dia da semana: ");
        int varNum = sc.nextInt();
        String diaSemana = "";

        switch (varNum) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda";
                break;
            case 3:
                diaSemana = "terça";
                break;
            case 4:
                diaSemana = "quarta";
                break;
            case 5:
                diaSemana = "quinta";
                break;
            case 6:
                diaSemana = "sexta";
                break;
            case 7:
                diaSemana = "sábado";
                break;
            default:
                diaSemana = "domingo";
                varNum = 1;
        }

        System.out.printf("%s é o %do dia da semana%n", diaSemana, varNum);

        sc.close();

    }
}
