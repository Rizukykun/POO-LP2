/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.lp2;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class POOLP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa doppio = new Pessoa("Doppio", 33, "Itália", "Carteiro", "O trabalho duro vence do talento quando o talento não trabalha duro!");
        Pessoa diavolo = new Mafioso("Diavolo", 33, "Itália", "Mafioso", "Nessuno può sfuggire del destino scelto. Rimane solo il risultato: che voi sarete distrotte. La eterna cima essiste solo per me. Puoi cantare canzoni di tristezza nel mondo senza tempo.");
        System.out.println("Pressione enter a cada iteração para ler a conversa com paciência");
        Pressenter();
        doppio.Cumprimentar(diavolo);
        Pressenter();
        diavolo.Cumprimentar(doppio);
        Pressenter();
        doppio.PerguntarIdade();
        Pressenter();
        System.out.print("Não é relevante, meu pequeno " + doppio.getNome() + ". (apesar de ter " + diavolo.getIdade() + ") Mas e você? ");
        diavolo.PerguntarIdade();
        Pressenter();
        System.out.println(doppio.getIdade());
        Pressenter();
        doppio.PerguntarNacionalidade();
        Pressenter();
        System.out.print("Nasci aqui mesmo na " + diavolo.getNacionalidade() + ". E meu pequeno " + doppio.getNome() + "? ");
        diavolo.PerguntarNacionalidade();
        Pressenter();
        System.out.println("Que coincidência! também nasci aqui na " + doppio.getNacionalidade());
        Pressenter();
        System.out.println("Di molto!");
        Pressenter();
        doppio.PerguntarTrabalho();
        Pressenter();
        System.out.println("Como posso explicar a você a minha profissão... Digamos que eu sou o Chefe de uma organização (" + diavolo.getTrabalho() + ")");
        Pressenter();
        System.out.println("Oh, e eu sou " + doppio.getTrabalho() + "!");
        Pressenter();
        System.out.println("(Não que eu tenha perguntado, mas tudo bem)");
        Pressenter();
        doppio.PerguntarFrase();
        Pressenter();
        System.out.println("Me diga uma primeiro, meu caro...");
        Pressenter();
        System.out.println(doppio.getFraseMotivacional());
        Pressenter();
        System.out.println("Muito bom, agora a minha: ");
        Pressenter();
        System.out.println(diavolo.getFraseMotivacional());
        Pressenter();
        System.out.println("UAU!");
        Pressenter();
        doppio.Despedida(diavolo);
        Pressenter();
        diavolo.Despedida(doppio);
        Pressenter();
        
    }    
      
    public static void Pressenter(){
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }    
}
