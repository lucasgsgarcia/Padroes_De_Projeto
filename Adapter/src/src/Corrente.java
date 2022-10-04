package src;

class CorrenteAlternada implements RedeCliente {
    @Override
    public void conectarNaRede() {
        System.out.println("Conectada em corrente alternada");
    }
}

class CorrenteContinua implements RedeCliente {
    @Override
    public void conectarNaRede() {
        System.out.println("Conectada em corrente contínua");
    }
}

class AdapterContinuaParaAlternada extends CorrenteAlternada implements RedeCliente{
    private CorrenteContinua correnteContinua; // Resultado Final

    public AdapterContinuaParaAlternada(CorrenteContinua correnteContinua) {
        this.correnteContinua = correnteContinua;
    }

    @Override
    public void conectarNaRede(){
        System.out.println("Corrente alternada agora está");
        correnteContinua.conectarNaRede();
        System.out.println("Através de um adaptador!");
    }
}
