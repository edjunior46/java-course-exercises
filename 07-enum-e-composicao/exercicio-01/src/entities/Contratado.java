package entities;

import java.time.LocalDate;
import java.util.ArrayList;

import entities.enums.NivelContratado;

public class Contratado {
    
    private String nome;
    private NivelContratado nivel;
    private double salarioBase;
    private ArrayList<Comissao> comissoes = new ArrayList<>();

    public Contratado() {

    }

    public Contratado(String nome, String nivelContratado, double salarioBase) {
        this.nome = nome;
        this.nivel = NivelContratado.valueOf(nivelContratado.toUpperCase());
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelContratado getNivel() {
        return nivel;
    }

    public void setNivel(NivelContratado nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<Comissao> getComissoes() {
        return this.comissoes;
    }

    public double calculaGanhos(String data) {
        int mes = Integer.parseInt(data.split("/")[0]);
        int ano = Integer.parseInt(data.split("/")[1]);
        LocalDate comparacao = LocalDate.of(ano, mes, 01);
        double total = 0.0;

        for (Comissao comissao : comissoes) {
            if (comissao.getData().getMonth() == comparacao.getMonth() && comissao.getData().getYear() == comparacao.getYear()) {
                total += comissao.valorTotal();
            }
        }

        return total + getSalarioBase();
    }

}
