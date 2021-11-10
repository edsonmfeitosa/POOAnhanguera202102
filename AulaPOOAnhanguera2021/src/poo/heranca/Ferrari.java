
package poo.heranca;

import poo.associacao.Automovel;
import poo.associacao.Pessoa;

public class Ferrari extends Automovel{

    public Ferrari(){
        super();
    }
    public Ferrari(Pessoa pessoa) {
        super(pessoa);
    }

    
    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
    @Override
    public String toString() {
        return  "Ferrari:" +
                "\n-->Placa: "+placa +
               "\n-->Potência: "+getMotor().getFatorPotencia();
    }
    
}
