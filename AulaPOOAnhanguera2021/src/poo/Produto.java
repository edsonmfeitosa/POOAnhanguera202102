
package poo;

public class Produto {
    private String nome;
    private double valor;
    private double desconto;

    public Produto(String nome, double valor, double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    public Produto() {
    
    }
    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
    
    public double calcular(){
        return valor * (1 - desconto);
    }
    public double calcular(double descontoGerente){
        return  valor * (1 - (desconto + descontoGerente));
    }
    
    public static double calcular(double valor, double desconto){
        return valor * (1 - desconto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
}
