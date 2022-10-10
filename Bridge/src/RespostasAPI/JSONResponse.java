package RespostasAPI;

public class JSONResponse implements RespostaAPI{
    @Override
    public void responderRequest() {
        System.out.println("Resposta em formato JSON.");
    }
}
