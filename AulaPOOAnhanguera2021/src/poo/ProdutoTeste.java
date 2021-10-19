
package poo;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("caneta", 5.0, 0.1);
        Produto p2 = new Produto("caderno", 10.0, 0.1);
        
        System.out.println("Valor do produto "+ p1.getNome() + " é "
                + p1.calcular());
        System.out.println("Valor do produto "+ p2.getNome() + " é "
                + p2.calcular(0.05));
        
        System.out.println("Valor final: "+Produto.calcular(5.0, 0.2));
    }
}
