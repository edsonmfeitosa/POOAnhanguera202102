
package poo;

public class Pessoa {
    private String nome;
    public String telefone;
    private int idade;
    
    public void perguntarONome(Pessoa pessoa){
        System.out.println("Qual o seu nome?");
        pessoa.responderONome();
    }
    
    public void responderONome(){
        System.out.println("Meu nome é "+nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        if (idade < 0) {
            this.idade = 0;
        }
        else
        {
            this.idade = idade;
        }
    }
    public int getIdade(){
        return idade;
    }
    
}
