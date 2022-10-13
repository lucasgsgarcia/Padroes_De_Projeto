public interface SaqueChain {

    void setProximo(SaqueChain saqueChain);

    void entregar(Saque saque);
}
