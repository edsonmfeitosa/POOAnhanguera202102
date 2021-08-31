
package fundamentos.estrutura;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        boolean teste1 = true;
        int numero = 2;
        /*
        if (teste1) {
            System.out.println("verdadeiro no if");
        }
        */
        if (numero > 3) {
            System.out.println("verdadeiro: "+(numero >= 3));
        }
        else if(numero == 3){
            System.out.println("número igual a 3");
        }
        else{
            System.out.println("menor que 3");
        }
        /*Exemplo de switch case */
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int n = tec.nextInt();
        
        switch(n){
            case 1:
                System.out.println("entrou no caso 1");
                break;
            case 2:
                System.out.println("entrou no caso 2");
                break;
            default:
                System.out.println("não é 1 nem 2");
        }
    }
}
