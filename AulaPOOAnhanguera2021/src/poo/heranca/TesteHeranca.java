
package poo.heranca;

import poo.associacao.Automovel;
import poo.associacao.Pessoa;

public class TesteHeranca {
    public static void main(String[] args) {
        
        Automovel a1 = new Automovel();
        a1.setPlaca("WWW 1122");
        
        Idea idea = new Idea();
        idea.setPlaca("QQW 1234");
        idea.acelerar();
        System.out.println(idea.getMotor().getFatorPotencia());
        
        Ferrari ferrari = new Ferrari();
        ferrari.setPlaca("ASD 3333");
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("A ferrari da placa "+ ferrari.getPlaca() +
                " tem o fator de potência "+ferrari.getMotor().getFatorPotencia());
        
        System.out.println(idea.toString());
        System.out.println(ferrari.toString());
        
        Pessoa pes = new Pessoa("Joaquim");
        pes.setAutomoveis(ferrari);
        pes.setAutomoveis(idea);
        pes.setAutomoveis(a1);
    }
}
