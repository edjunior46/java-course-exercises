package entities;

public class ContaBancaria {

    private static int clientes;
    
    private int id;
    private String titular;
    private double saldo;


    public ContaBancaria(String titular) {
        this.id = contadorClientes();;
        this.titular = titular;
    }

    public ContaBancaria(String titular, double depositoInicial) {
        this.id = contadorClientes();
        this.titular = titular;
        deposito(depositoInicial);
    }

    public int getId() {
        return this.id;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String novoTitular) {
        this.titular = novoTitular;
    }

    public String getSaldo() {
        return "$" + String.format("%.2f", this.saldo);
    }

    public void deposito(double quantiaDeposito) {
        this.saldo += quantiaDeposito;
    }

    public void retirada(double quantiaRetirada) {
        double quantiaRetiradaTaxa = quantiaRetirada + 5.00;
        if (this.saldo < quantiaRetiradaTaxa) {
            System.out.println("OPERACAO NAO REALIZADA: Saldo insuficiente");
        } else {
            this.saldo -= quantiaRetiradaTaxa;
        }
    }

    public String toString() {
        return "ID: " + this.getId() 
        + ", Titular: " + this.getTitular() 
        + ", Saldo: " + this.getSaldo();
    }

    public static int contadorClientes() {
        clientes++;
        return clientes;
    }

}
