import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura e altura do retangulo: ");
        Retangulo retangulo = new Retangulo(sc.nextDouble(), sc.nextDouble());

        System.out.printf("Area: %.2f%nPerimetro: %.2f%nDiagonal: %.2f%n", 
        retangulo.getArea(), retangulo.getPerimetro(), retangulo.getDiagonal());
        
        sc.close();

    }
}
