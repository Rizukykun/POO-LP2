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
public class Pessoa {

    private String nome;
    private int idade;
    private String nacionalidade;
    private String trabalho;
    private String fraseMotivacional;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the trabalho
     */
    public String getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    /**
     * @return the fraseMotivacional
     */
    public String getFraseMotivacional() {
        return fraseMotivacional;
    }

    /**
     * @param fraseMotivacional the fraseMotivacional to set
     */
    public void setFraseMotivacional(String fraseMotivacional) {
        this.fraseMotivacional = fraseMotivacional;
    }
    //Construtor alternativo

    public Pessoa(String nome, int idade, String nacionalidade, String trabalho, String fraseMotivacional) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.trabalho = trabalho;
        this.fraseMotivacional = fraseMotivacional;
    }

    //Métodos
    public void Cumprimentar(Pessoa pessoa){
        System.out.println("Olá " + pessoa.getNome());
    }
    public void PerguntarIdade(){
        System.out.println("Quantos anos você tem?");
    }
    public void PerguntarNacionalidade(){
        System.out.println("Em qual país você nasceu?");
    }
    public void PerguntarTrabalho(){
        System.out.println("Com o que você trabalha?");
    }
    public void PerguntarFrase(){
        System.out.println("Poderia me dizer uma frase motivacional?");
    }
    public void Despedida(Pessoa pessoa){
        System.out.println("Até mais " + pessoa.getNome());
    }
}
