package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario() {

    }

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double aumentarSalario(double porcentagem) {
        salarioBruto += (salarioBruto / 100) * porcentagem;
        return salarioLiquido();
    }

}
