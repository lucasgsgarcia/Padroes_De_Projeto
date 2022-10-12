public class MensageiroTres extends Mensageiro{
    public MensageiroTres(Mediator mediator) {
        super(mediator);
    }

    @Override
    void receberMensagem(String mensagem) {
        System.out.println("Mensageiro 3 - Mensagem recebida: " + mensagem);
    }
}
