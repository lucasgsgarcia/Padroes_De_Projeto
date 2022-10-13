public class Entregador100Reais implements SaqueChain{

    private SaqueChain chain;

    @Override
    public void setProximo(SaqueChain proximo) {
        this.chain = proximo;
    }

    @Override
    public void entregar(Saque saque) {
        if (saque.getQuantidade() >= 100){
            int sacado = saque.getQuantidade()/100;
            int restante = saque.getQuantidade() % 100;
            System.out.println("Sacando " + sacado + " em notas de R$ 100.");
            if(restante != 0){
                this.chain.entregar(new Saque(restante));
            }
        } else {
            this.chain.entregar(saque);
        }
    }
}
