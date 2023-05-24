package com.testedesoftware.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class Corretor {
    private String nome;
    private LocalDate dataContratacao;
    private double salario;
    private double vendasDoMes;
    private double comissao;

    public Corretor() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()<3){
         throw new IllegalArgumentException("O nome deve ter 3 ou mais letras!");   
        }else{
        this.nome = nome;
        }
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

//    formato de preenchimento da data usando o LocalDate.of(ano,mes,dia)
    public void setDataContratacao(LocalDate dataContratacao) {
        if(dataContratacao.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("A data da contratação não pode ser futura!");
        }else{
        this.dataContratacao = dataContratacao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario<1000){
            throw new IllegalArgumentException("O salário não dever ser menor que 1000!");
        }else{
        this.salario = salario;
        }
    }

    public double getVendasDoMes() {
        return vendasDoMes;
    }

    public void setVendasDoMes(double vendasDoMes) {
        if(vendasDoMes<0){
         throw new IllegalArgumentException("O valor da venda não pode ser negativo!");   
        }else{
        this.vendasDoMes = vendasDoMes;
        }
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double vendasDoMes) {
 
        if(vendasDoMes>50000){
            comissao = ((vendasDoMes/100)*12);
            this.comissao = comissao;
        }else if(vendasDoMes>=30000&&vendasDoMes<=50000){
            comissao = ((vendasDoMes/100)*9.5);
            this.comissao = comissao;
        }else {
            comissao = ((vendasDoMes/100)*7);
            this.comissao = comissao;
        }
    }

    @Override
    public String toString() {
        return "Corretor{" + "Nome: " + nome + ", Data de Contratação: " + dataContratacao + ", Salário: " + salario + ", Vendas Do Mês: " + vendasDoMes + ", Comissão: " + comissao + '}';
    }
    
    
    
    
    public String Relatorio(Corretor corretor1, Corretor corretor2, Corretor corretor3){
        
        List corretores = new ArrayList<Corretor>();
        corretores.add(corretor1);
        corretores.add(corretor2);
        corretores.add(corretor3);
        double totalDeVendas = corretor1.getVendasDoMes()+corretor2.getVendasDoMes()+corretor3.getVendasDoMes();       
        String totalMes = Double.toString(totalDeVendas);
        return corretores.toString()+" Total de Vendas: " + totalMes;
                
    }
    
    
    
}
