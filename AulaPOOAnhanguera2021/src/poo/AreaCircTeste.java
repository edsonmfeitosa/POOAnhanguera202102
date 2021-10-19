
package poo;

import java.util.Scanner;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc area = new AreaCirc(50);
        AreaCirc area2 = new AreaCirc();
        area2.setRaio(100);
        
        System.out.println("valor do pi: "+area.pi);
        
        System.out.println("Ob1: "+AreaCirc.pi);
        
        System.out.println("Área do objeto 1:"+ area.calcular());
        System.out.println("Área do objeto 2:"+ area2.calcular());
    }
}
