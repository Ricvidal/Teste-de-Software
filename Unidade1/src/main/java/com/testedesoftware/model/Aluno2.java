/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testedesoftware.model;

/**
 *
 * @author ricardo
 */
public class Aluno2 {

    private String nome;

    public Aluno2() {
    }

    public boolean setNome(String nome) {
        if (nome.length() < 3) {
            return false;
        } else {
            return true;
        }
    }
}
