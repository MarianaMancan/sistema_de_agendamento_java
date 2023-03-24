/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Models.Servico;

/**
 *
 * @author Mariana
 */
public class Main {
    
    public static void main(String[] args){
        String nome = "tiago";
        System.out.println(nome);
        Servico servico = new Servico(1,"cabelo",30);
        System.out.println(servico.getDescricao());
    }
}
