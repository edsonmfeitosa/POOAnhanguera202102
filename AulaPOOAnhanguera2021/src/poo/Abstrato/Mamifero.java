
package poo.Abstrato;

public abstract class Mamifero extends Animal{

    @Override
    public abstract void mover();
    
    public void mamar(){
        System.out.println("Leite");
    }
}
