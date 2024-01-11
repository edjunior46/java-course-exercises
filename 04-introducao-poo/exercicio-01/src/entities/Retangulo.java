package entities;

public class Retangulo {
    
    public double largura;
    public double altura;

    public Retangulo() {

    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea() {
        return largura * altura;
    }

    public double getPerimetro() {
        return (largura + altura) * 2.0;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

}
