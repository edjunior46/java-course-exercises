import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
         * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
         * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
         * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
         * Se o ponto estiver na origem, escreva a mensagem “Origem”.
         * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os valores de x e y: ");
        double varX = sc.nextDouble();
        double varY = sc.nextDouble();

        if (varX == 0 && varY == 0) {
            System.out.println("Origem");
        } else if (varX < 0 && varY < 0) {
            System.out.println("Q3");
        } else if (varX > 0 && varY > 0) {
            System.out.println("Q1");
        } else if (varX < 0 && varY > 0) {
            System.out.println("Q2");
        } else if (varX > 0 && varY < 0) {
            System.out.println("Q4");
        } else if (varX == 0 && varY != 0) {
            System.out.println("Eixo Y");
        } else if (varX != 0 && varY == 0) {
            System.out.println("Eixo X");
        }

        sc.close();

    }
}
