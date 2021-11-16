
package poo.polimorfismo;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(65.3);
        System.out.println(p1.getPeso());
        Arroz a = new Arroz();
        a.setPeso(0.3);
        p1.comer(a);
        System.out.println(p1.getPeso());
        Feijao f = new Feijao();
        f.setPeso(0.120);
        p1.comer(f);
        Sorvete s = new Sorvete();
        s.setPeso(0.4);
        p1.comer(s);
        System.out.println(p1.getPeso());
        Salada salada = new Salada();
        salada.setPeso(0.1);
        p1.comer(salada);
        System.out.println(p1.getPeso());
        
    }
}
