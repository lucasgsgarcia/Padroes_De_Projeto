public class Entregador5Reais implements SaqueChain{

    private SaqueChain chain;

    @Override
    public void setProximo(SaqueChain proximo) {
        this.chain = proximo;
    }

    @Override
    public void entregar(Saque saque) {
        if (saque.getQuantidade() >= 5){
            int sacado = saque.getQuantidade()/5;
            int restante = saque.getQuantidade() % 5;
            System.out.println("Sacando " + sacado + " em notas de R$ 5.");
            if(restante != 0){
                this.chain.entregar(new Saque(restante));
            }
        } else {
            this.chain.entregar(saque);
        }
    }
}
