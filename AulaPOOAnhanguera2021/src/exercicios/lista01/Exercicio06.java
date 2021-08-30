
package exercicios.lista01;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        var calc =  Math.pow(6*(3+2),2);
        var calc1 =  (calc ) / 3*2;
        var calc2 =  Math.pow( ((1-5)*(2-7))/2,2 );
        var calc3 =  Math.pow(calc1 - calc2, 3);
        var calc4 =  calc3 / Math.pow(10,3);
        System.out.println("\n calc "+calc);
        System.out.println("\n calc1 "+calc1);
        System.out.println("\n calc2 "+calc2);

        System.out.println("\n calc3 "+calc3);
        System.out.println("Resultado: "+calc4);
*/
        double calEsq = (Math.pow(6 * (3+2), 2)) / (3*2);
        double calDir = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
        double parteCima = Math.pow((calEsq - calDir ), 3);
        double resultado = parteCima / Math.pow(10, 3);
        System.out.println(resultado);
    }
}
