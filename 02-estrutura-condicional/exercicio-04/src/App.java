import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
         * duração do jogo, sabendo que o mesmo pode começar em um dia e terminar
         * em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial e final do jogo: ");
        int varInicio = sc.nextInt();
        int varFim = sc.nextInt();

        int duracao;
		if (varInicio < varFim) {
			duracao = varFim - varInicio;
		}
		else {
			duracao = 24 - varInicio + varFim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
        
    }
}
