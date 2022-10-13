public class Main {

    public static void main(String[] args) {
        OpsDeComunicacao proxy = new ProxyTorreDeComunicacao("COM-01");
        OpsDeComunicacao proxyDois = new ProxyTorreDeComunicacao("COM-02");

        proxy.operacao("MENSAGEM");
        proxy.operacao("MENSAGEM");
        proxyDois.operacao("MENSAGEM");
        proxyDois.operacao("MENSAGEM");

    }
}
