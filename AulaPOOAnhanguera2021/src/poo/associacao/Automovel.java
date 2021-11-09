
package poo.associacao;

public class Automovel {
    private String modelo;
    private String placa;
    private Motor motor;
    private Pessoa dono;

    public Automovel(Pessoa pessoa) {
        motor = new Motor(this);
        this.dono = pessoa;
    }
    public Automovel() {
        motor = new Motor(this);
    }
    
    public void acelerar(){
        motor.setFatorPotencia(
                motor.getFatorPotencia() + 5
        );
    }
    public void frear(){
        if (motor.getFatorPotencia() <= 5) {
            motor.setFatorPotencia(0);
        }
        else{
            motor.setFatorPotencia(motor.getFatorPotencia() - 5);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    public Pessoa getDono(){
        return this.dono;
    }
    
}
