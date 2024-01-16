package entities;

public class Funcionario {

    private static int idCount;
    
    private final int ID;
    private String nome;
    private double salario;

    public Funcionario() {
        idCount++;
        this.ID = idCount;
    }

    public Funcionario(String nome, double salario) {
        idCount++;
        this.nome = nome;
        this.salario = salario;
        this.ID = idCount;
    }

    public int getId() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += (salario * porcentagem) / 100;
    }

}
