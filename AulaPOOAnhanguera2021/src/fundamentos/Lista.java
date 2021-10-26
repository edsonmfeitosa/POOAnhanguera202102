
package fundamentos;

import java.util.ArrayList;
import java.util.List;
import poo.Fornecedor;
import poo.Produto;

public class Lista {
    public static void main(String[] args) {
        /*
        int[] x = new int[3];       
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        System.out.println(x[0]);
        x[0] = 10;
        System.out.println(x[0]);
        //for
        for (int i = 0; i < x.length; i++) {
            System.out.println("posição "+ (i+1) + "= "+x[i]);
        }
        //foreach
        for (int i : x) {
            System.out.println("Valor atual: "+i);
        }
        int[] y = new int[4];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        y[3] = 55;
        
        for (int i : y) {
            System.out.println("Array novo:"+ i);
        }
        */
        //conceito de lista
        
        /*
        ArrayList<String> nomes = new ArrayList<>();
        //List<String> nomes2 = new ArrayList<>();
        
        //add
        nomes.add("Edson");
        nomes.add(1, "Renata");
        nomes.add("Victor");
        nomes.add("Vinícius");
        System.out.println(nomes);
        
        //modificar
        nomes.set(0, "José");
        System.out.println(nomes);
        
        //contains
        if (nomes.contains("Vinícius")) {
            System.out.println("Tem o Vinícius");
        }
        //get
        System.out.println("O terceiro da lista é "+nomes.get(2));
        //pegar a posição na lista
        System.out.println("Posição do Victor: "+nomes.indexOf("Victor"));
        
        nomes.remove("José");
        System.out.println(nomes);
        
        System.out.println("Quantidade de itens na lista: "+nomes.size());
        
        //for
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        for(String nome : nomes){
            System.out.println("forech: "+nome);
        }
       nomes.clear();
        System.out.println(nomes);
        */
        Fornecedor f1 = new Fornecedor();
        f1.nome = "Papelaria do parque";
        f1.produtos.add(new Produto("Caneta", 2.5, 0.0));
        
        Produto p2 = new Produto();
        p2.setNome("Caderno");
        p2.setValor(10.0);
        
        f1.produtos.add(p2);
        
        System.out.println("Produto: "+ 
                f1.produtos.get(1).getNome());
        
        System.out.println("fornecedor: "+f1.nome);
        for (Produto produto : f1.produtos) {
            System.out.println("---->Nome: "+produto.getNome());
            System.out.println("---->Desconto: "+produto.getDesconto());
            System.out.println("---->Preço: "+produto.getValor()+"\n");
        }
        
    }
}
