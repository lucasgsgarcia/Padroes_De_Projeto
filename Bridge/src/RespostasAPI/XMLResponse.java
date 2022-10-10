package RespostasAPI;

public class XMLResponse implements RespostaAPI{
    @Override
    public void responderRequest() {
        System.out.println("Resposta em formato XML.");
    }
}
