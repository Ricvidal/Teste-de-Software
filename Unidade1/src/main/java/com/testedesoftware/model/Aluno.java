package com.testedesoftware.model;

/**
 *
 * @author ricardo
 */
public class Aluno {

    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private int faltas;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 3) {
            throw new IllegalArgumentException("O nome deve ser acima de 3 letras!");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("A idade deve ser maior de 18!");
        } else {
            this.idade = idade;
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 100) {
            throw new IllegalArgumentException("A nota deve está entre 0 e 100!");
        } else {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {

        return nota2;

    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 100) {
            throw new IllegalArgumentException("A nota deve está entre 0 e 100!");
        } else {
            this.nota2 = nota2;
        }
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        if (faltas < 0) {
            throw new IllegalArgumentException("A falta deve ser igual ou maior que zero!");
        } else {
            this.faltas = faltas;
        }
    }

    public boolean cadastrarAluno(String nome, int idade, double nota1, double nota2, int faltas) {

        Aluno aluno = new Aluno();
        try {
            aluno.setNome(nome);
            aluno.setIdade(idade);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
            aluno.setFaltas(faltas);
            return true;
        } catch (IllegalArgumentException e) {

            return false;
        }
    }

    public double MediaAritmetica(double nota1, double nota2) {

        Aluno aluno = new Aluno();
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);

        return (aluno.getNota1() + aluno.getNota2()) / 2;
    }

    public String CondicaoAluno(double media) {
        if (media >= 60) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }

    }

}
