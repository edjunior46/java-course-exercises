import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Comissao;
import entities.Contratado;
import entities.enums.NivelContratado;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Contratando um freela");

        Contratado contratado = new Contratado();

        System.out.print("Nome: ");
        contratado.setNome(sc.nextLine());

        System.out.print("Nível (Junior, Pleno ou Senior): ");
        contratado.setNivel(NivelContratado.valueOf(sc.nextLine().toUpperCase()));

        System.out.print("Salario Base: ");
        contratado.setSalarioBase(sc.nextDouble());

        System.out.print("Numero de comissoes: ");
        int numComissao = sc.nextInt();

        for(int i = 0; i < numComissao; i++) {
            System.out.println();
            Comissao comissao = new Comissao();
            System.out.printf("Contrato #%d%n", (i + 1));
            System.out.print("Data de inicio (DD/MM/YYYY): ");
            sc.nextLine();
            comissao.setData(LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.print("Valor por hora: ");
            comissao.setValorPorHora(sc.nextDouble());
            System.out.print("Duracao (horas): ");
            comissao.setDuracaoHoras(sc.nextInt());
            contratado.getComissoes().add(comissao);
        }

        System.out.println();

        // for (Comissao comissao : contratado.getComissoes()) {
        //     System.out.println(comissao);
        // }

        System.out.print("Digite o mês e ano que deseja calcular os ganhos: ");
        sc.nextLine();
        System.out.println("$" + String.format("%.2f", contratado.calculaGanhos(sc.nextLine())));

        sc.close();

    }
}
