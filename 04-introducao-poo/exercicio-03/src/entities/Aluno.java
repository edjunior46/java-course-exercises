package entities;

public class Aluno {
    
    public String nome;
    public double nota01;
    public double nota02;
    public double nota03;
    public double nota04;

    public Aluno() {

    }

    public Aluno(String nome, double nota01, double nota02, double nota03, double nota04) {
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }

    public double notaFinal() {
        return (nota01 + nota02 + nota03 + nota04) / 4.0;
    }

}
