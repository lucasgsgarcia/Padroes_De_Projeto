public class Entregador50Reais implements SaqueChain{

    private SaqueChain chain;

    @Override
    public void setProximo(SaqueChain proximo) {
        this.chain = proximo;
    }

    @Override
    public void entregar(Saque saque) {
        if (saque.getQuantidade() >= 50){
            int sacado = saque.getQuantidade()/50;
            int restante = saque.getQuantidade() % 50;
            System.out.println("Sacando " + sacado + " em notas de R$ 50.");
            if(restante != 0){
                this.chain.entregar(new Saque(restante));
            }
        } else {
            this.chain.entregar(saque);
        }
    }
}
