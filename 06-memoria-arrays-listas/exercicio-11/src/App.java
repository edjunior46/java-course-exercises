import entities.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao analisados?: ");
        Aluno[] alunos = new Aluno[sc.nextInt()];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            sc.nextLine();
            System.out.printf("Digite o nome do %do aluno: ", (i + 1));
            alunos[i].setNome(sc.nextLine());
            double[] notas = new double[2];
            System.out.print("Digite a nota do 1o semestre: ");
            notas[0] = sc.nextDouble();
            System.out.print("Digite a nota do 2o semestre: ");
            notas[1] = sc.nextDouble();
            alunos[i].setNotas(notas);
            System.out.println();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < alunos.length; i++) {
            double media = 0.0;
            double[] notas = alunos[i].getNotas();
            for (int j = 0; j < notas.length; j++) {
                media += notas[j];
            }

            media = media / notas.length;

            if (media >= 6.0) {
                System.out.println(alunos[i].getNome());
            }
        }

        sc.close();

    }
}
