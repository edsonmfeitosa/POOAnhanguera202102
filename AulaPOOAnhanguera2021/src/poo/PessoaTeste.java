
package poo;
import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //p1.nome = "Edson";
        p1.setNome("Edson");
        p1.telefone = "153333555";
        p1.setIdade(30);
        
        Pessoa p2 = new Pessoa();
        //p2.nome = "Carlos";
        p2.setNome("Carlos");
        
        var p3 = new Pessoa();
        //p3.nome = "Natália";
        p3.setNome("Natália");
        //p3.idade = -3;
        p3.setIdade(-3);
        System.out.println("Idade da "+ p3.getNome() + " é "+p3.getIdade());
        
        p1.perguntarONome(p2);
        //p2.responderONome();
        
        System.out.println(p2.getNome());
        p3.responderONome();
        
    }
}
