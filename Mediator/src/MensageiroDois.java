public class MensageiroDois extends Mensageiro{
    public MensageiroDois(Mediator mediator) {
        super(mediator);
    }

    @Override
    void receberMensagem(String mensagem) {
        System.out.println("Mensageiro 2 - Mensagem recebida: " + mensagem);
    }
}
