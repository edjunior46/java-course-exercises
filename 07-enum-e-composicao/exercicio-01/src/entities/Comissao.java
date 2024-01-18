package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Comissao {
    
    private LocalDate data;
    private double valorPorHora;
    private int duracaoHoras;

    public Comissao() {

    }

    public Comissao(LocalDate data, double valorPorHora, int duracaoHoras) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.duracaoHoras = duracaoHoras;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public double valorTotal() {
        return valorPorHora * duracaoHoras;
    }

    @Override
    public String toString() {
        return "Data de inicio: " +
        getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
        "Duracao (em horas): " +
        getDuracaoHoras() + "\n" +
        "Valor por hora: $" +
        String.format("%.2f", getValorPorHora()) + "\n" +
        "Valor Total: $" + 
        String.format("%.2f", valorTotal());
    }

}
