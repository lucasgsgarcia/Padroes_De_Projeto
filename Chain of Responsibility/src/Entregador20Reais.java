public class Entregador20Reais implements SaqueChain{

    private SaqueChain chain;

    @Override
    public void setProximo(SaqueChain proximo) {
        this.chain = proximo;
    }

    @Override
    public void entregar(Saque saque) {
        if (saque.getQuantidade() >= 20){
            int sacado = saque.getQuantidade()/20;
            int restante = saque.getQuantidade() % 20;
            System.out.println("Sacando " + sacado + " em notas de R$ 20.");
            if(restante != 0){
                this.chain.entregar(new Saque(restante));
            }
        } else {
            this.chain.entregar(saque);
        }
    }
}
