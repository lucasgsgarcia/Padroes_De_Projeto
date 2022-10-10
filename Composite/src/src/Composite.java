package src;

import java.util.ArrayList;
import java.util.List;



class SetupCompletoComposite implements Component{

    List<Component> perifericos;

    String nome;
    ComputerComposite pc;

    public SetupCompletoComposite(String nome, ComputerComposite pc) {
        this.nome = nome;
        this.pc = pc;
        perifericos = new ArrayList<>();
    }

    @Override
    public void process() {
        pc.process();
        for (Component c : perifericos){
            c.process();
        }
    }

    public void addPeriferico(Component componente){
        perifericos.add(componente);
    }
}

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
        for (Component c : componentes) {
            c.process();
        }
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
