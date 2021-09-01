
package exercicios.lista02;

import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args) {
        //4)	Entrar com 5 números e mostrar na saída qual é o menor e 
        //      qual e o maior número.
        int numero, menor, maior;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = teclado.nextInt();
        menor = numero;
        maior = numero;
        System.out.println("Digite um número");
        numero = teclado.nextInt();
        if (numero >= maior) {
            maior = numero;
        }
        if (numero <= menor) {
            menor = numero;
        }
        System.out.println("Digite um número");
        numero = teclado.nextInt();
        if (numero >= maior) {
            maior = numero;
        }
        if (numero <= menor) {
            menor = numero;
        }System.out.println("Digite um número");
        numero = teclado.nextInt();
        if (numero >= maior) {
            maior = numero;
        }
        if (numero <= menor) {
            menor = numero;
        }System.out.println("Digite um número");
        numero = teclado.nextInt();
        if (numero >= maior) {
            maior = numero;
        }
        if (numero <= menor) {
            menor = numero;
        }
        System.out.println("O menor número é "+menor);
        System.out.println("O maior número é "+maior);
        
    }
}
