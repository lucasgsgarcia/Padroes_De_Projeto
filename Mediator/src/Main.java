public class Main {

    public static void main(String[] args) {
        MediadorDeMensagens mediador = new MediadorDeMensagens();

        MensageiroUm m1 = new MensageiroUm(mediador);
        MensageiroDois m2 = new MensageiroDois(mediador);
        MensageiroTres m3 = new MensageiroTres(mediador);

        mediador.adicionarMensageiro(m1);
        mediador.adicionarMensageiro(m2);
        mediador.adicionarMensageiro(m3);

        m1.enviarMensagem("Mensagem do Mensageiro 1");
        m2.enviarMensagem("Mensagem do Mensageiro 2");
        m3.enviarMensagem("Mensagem do Mensageiro 3");

    }
}
