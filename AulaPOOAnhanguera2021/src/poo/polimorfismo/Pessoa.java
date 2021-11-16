
package poo.polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    //Polimorfismo Adhoc = Sobrecarga
    /*
    public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comer(Sorvete sorvete){
        this.peso += sorvete.getPeso();
    }
    */
    //Polimorfismo Universal - Paramétrico
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
}
