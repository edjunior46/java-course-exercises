import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
         * Em seguida, calcule e mostre: 
        a) a área do triângulo retângulo que tem A por base e C por altura. 
        b) a área do círculo de raio C. (pi = 3.14159) 
        c) a área do trapézio que tem A e B por bases e C por altura. 
        d) a área do quadrado que tem lado B. 
        e) a área do retângulo que tem lados A e B
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 3 valores: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.println();

        System.out.println("área do triângulo retângulo que tem A por base e C por altura: " + ((A * C)/2));
        System.out.println("área do círculo de raio C: " + (3.14159 * (C * C)));
        System.out.println("área do trapézio que tem A e B por bases e C por altura: " + (((A + B) * C)/2));
        System.out.println("área do quadrado que tem lado B: " + (B * B));
        System.out.println("a área do retângulo que tem lados A e B: " + (A * B));


        sc.close();

    }
}
