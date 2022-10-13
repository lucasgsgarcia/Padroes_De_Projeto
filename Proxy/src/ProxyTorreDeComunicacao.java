public class ProxyTorreDeComunicacao implements OpsDeComunicacao{

    private Aeronave aviao;

    private String codigoCOM;

    public ProxyTorreDeComunicacao(String codigoCOM) {
        this.codigoCOM = codigoCOM;
        processarOperacao();
    }

    private void processarOperacao(){
        System.out.println("Processando mensagem de: " + codigoCOM);
    }

    @Override
    public void operacao(String mensagem) {
        if(aviao == null) {
            aviao = new Aeronave();
        }
        aviao.operacao(codigoCOM + " - " + mensagem);
    }
}
