
package poo.heranca;

import poo.associacao.Automovel;
import poo.associacao.Pessoa;

public class Ferrari extends Automovel implements Luxo,Esportivo{

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

    @Override
    public void ligarArCondicionado() {
        System.out.println("O ar condicionado está ligado");
    }

    @Override
    public void desligarArCondicionado() {
        System.out.println("O ar condicionado está desligado");
    }

    @Override
    public void ligarTurbo() {
        System.out.println("O turbo está ligado");
    }

    @Override
    public void desligarTurbo() {
        System.out.println("O turbo está desligado");
    }
    
}
