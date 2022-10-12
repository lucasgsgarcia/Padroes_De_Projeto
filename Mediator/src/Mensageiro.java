public abstract class Mensageiro {
    protected Mediator mediator;

    public Mensageiro(Mediator mediator) {
        this.mediator = mediator;
    }

    void enviarMensagem(String mensagem){
        mediator.enviar(mensagem, this);
    }

    abstract void receberMensagem(String mensagem);
}
