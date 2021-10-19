
package poo;

public class AreaCirc {
   public static final double pi = 3.14;
   private double raio;

   public AreaCirc(double raio) {
       this.raio = raio;
   }

    public AreaCirc() {
    
    }
   
   double calcular(){
       //return pi * raio * raio;
       return pi * Math.pow(raio, 2);
   }
   
   //get set

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
