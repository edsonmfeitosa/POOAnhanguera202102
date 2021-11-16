
package poo.Abstrato;

public class Cachorro extends Mamifero{

    @Override
    public void mover() {
        System.out.println("Usando as quatro patas");
    }

    @Override
    public void respirar() {
        System.out.println("Oxigênio");
    }
    
}
