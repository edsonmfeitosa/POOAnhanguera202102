
package fundamentos.estrutura;

public class Repeticao {
    public static void main(String[] args) {
        //while
        int cont = 0;
        boolean teste = false;
        String nome = "Edson2";
        
        /* exemplo de utilidade do método equals
        Integer n1 = new Integer(2);
        Integer n2 = new Integer(2);
        System.out.println("n2: "+n2);
        System.out.println(n1.equals(n2));
        */
        
        while (cont < 10 && nome.equals("Edson")) {            
            System.out.println("exemplo while: "+cont);
            cont++;
            //++cont;
        }
        //do while
        cont = 0;
        do{
            System.out.println("exemplo do while: "+cont);
            cont++;
        }while(cont < 10 && nome.equals("Edson"));
            
        //for
        for (int i = 0; i < 10; i++) {
            
            if (i == 5) {
                continue;
            }
            System.out.println("exemplo de for continue: "+ i);
        }
        for (int i = 0; i < 10; i++) {
            
            if (i == 5) {
                break;
            }
            System.out.println("exemplo de for break: "+ i);
        }
    }
}
