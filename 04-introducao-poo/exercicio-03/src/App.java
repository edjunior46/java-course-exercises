import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Nota do 1o bimestre: ");
        double nota01 = sc.nextDouble();

        System.out.print("Nota do 2o bimestre: ");
        double nota02 = sc.nextDouble();

        System.out.print("Nota do 3o bimestre: ");
        double nota03 = sc.nextDouble();
        
        System.out.print("Nota do 4o bimestre: ");
        double nota04 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota01, nota02, nota03, nota04);
        
        System.out.println();
        System.out.printf("Nota final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() <= 6) {
            System.out.println("Reprovado");
            System.out.println("Faltam " + (6 - (aluno.notaFinal()) + " pontos"));
        } else {
            System.out.println("Aprovado");
            System.out.println("Parabens");
        }

        sc.close();

    }
}
