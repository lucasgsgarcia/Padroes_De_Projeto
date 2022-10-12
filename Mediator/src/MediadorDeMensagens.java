import java.util.ArrayList;

public class MediadorDeMensagens implements Mediator{

    protected ArrayList<Mensageiro> mensageiros;

    public MediadorDeMensagens() {
        mensageiros = new ArrayList<>();
    }

    void adicionarMensageiro(Mensageiro mensageiro){
        mensageiros.add(mensageiro);
    }

    @Override
    public void enviar(String mensagem, Mensageiro mensageiro) {
        for(Mensageiro m : mensageiros){
            m.receberMensagem(mensagem);
        }
    }
}
