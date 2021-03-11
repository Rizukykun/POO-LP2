/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.lp2;

/**
 *
 * @author Administrador
 */
public class Mafioso extends Pessoa{
    
    public Mafioso(String nome, int idade, String nacionalidade, String trabalho, String fraseMotivacional) {
        super(nome, idade, nacionalidade, trabalho, fraseMotivacional);
    }
    
    @Override
    public void Cumprimentar(Pessoa pessoa){
        System.out.println("Olá, meu pequeno " + pessoa.getNome());
    }
    @Override
    public void Despedida(Pessoa pessoa){
        System.out.println("Até mais... pequeno " + pessoa.getNome());
    }
}

