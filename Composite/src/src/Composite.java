package src;

import java.util.ArrayList;
import java.util.List;

class ComputerComposite implements Component{

    List<Component> componentes;

    String nome;
    double preco;

    public ComputerComposite(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        componentes = new ArrayList<>();
    }

    @Override
    public void process() {
        System.out.println("Interligando funcionalidades dos componentes...");
    }

    public void addComponent(Component componente){
        componentes.add(componente);
    }

    @Override
    public String toString() {
        return "Computador: \n" +
                "\n Componentes: " + componentes.toString() +
                "\n Nome: " + nome +
                "\n Preço: " + preco;
    }
}
