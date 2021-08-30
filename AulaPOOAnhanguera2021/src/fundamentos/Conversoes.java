package fundamentos;

import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args) {
        //conversões
        Scanner teclado = new Scanner(System.in);
        /*
        float x = (float) 10.1;
        Double y = Double.parseDouble("10");
        String teste = Double.toString(y);
        
        
        System.out.println("Digite um número");
        //int num = Integer.parseInt(teclado.nextLine());
        int num = teclado.nextInt();
        System.out.println("O número foi: "+ (num + 3));
        System.out.println((float)3 / 2);
*/
        String nome = "Edson Martin Feitosa";
        System.out.println(nome.toUpperCase().
                length());
        
        var x = Math.pow(2, 3);
        System.out.println("Resultado: "+ x);
        
        teclado.close();
        
    }
}
