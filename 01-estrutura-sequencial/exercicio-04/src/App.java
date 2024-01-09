import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * FAÇA UM PROGRAMA QUE LEIA O NÚMERO DE UM FUNCIONÁRIO, SEU NÚMERO DE HORAS
         * TRABALHADAS, O VALOR QUE RECEBE POR HORA E CALCULA O SALÁRIO DESSE FUNCIONÁRIO.
         * A SEGUIR, MOSTRE O NÚMERO DESSE FUNCIONÁRIO E SEU RESPECTIVO SALÁRIO, COM DUAS
         * CASAS DECIMAIS
         */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o número do funcionário: ");
        int employeeId = sc.nextInt();

        System.out.print("Digite as horas trabalhadas: ");
        int employeeHours = sc.nextInt();

        System.out.print("Digite o valor que recebe por hora: ");
        double employeeSalaryPerHour = sc.nextDouble();

        System.out.println();

        double employeeSalaryFinal = employeeSalaryPerHour * employeeHours;

        System.out.printf("Funcionário %d%nSalário Final: R$%.2f%n", employeeId, employeeSalaryFinal);

        sc.close();

    }
}
