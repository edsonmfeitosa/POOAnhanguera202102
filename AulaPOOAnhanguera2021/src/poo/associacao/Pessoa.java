
package poo.associacao;

import java.util.ArrayList;

public class Pessoa {
    private final String nome;
    ArrayList<Automovel> automoveis = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
    public void setAutomoveis(Automovel automovel){
        automoveis.add(automovel);
        automovel.setDono(this);
    }
    
}
