
package poo.heranca;

import poo.associacao.Automovel;
import poo.associacao.Pessoa;

public class Idea extends Automovel{

    public Idea() {
        super();
    }

    @Override
    public String toString() {
        return  "Idea:" +
                "\n-->Placa: "+getPlaca() +
               "\n-->Potência: "+getMotor().getFatorPotencia();
    }
    
}
