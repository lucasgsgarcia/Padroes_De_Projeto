public class MensageiroUm extends Mensageiro{
    public MensageiroUm(Mediator mediator) {
        super(mediator);
    }

    @Override
    void receberMensagem(String mensagem) {
        System.out.println("Mensageiro 1 - Mensagem recebida: " + mensagem);
    }
}
