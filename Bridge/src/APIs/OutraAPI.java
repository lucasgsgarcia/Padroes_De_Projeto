package APIs;

import RespostasAPI.RespostaAPI;

public class OutraAPI extends API{
    public OutraAPI(RespostaAPI respostaAPI) {
        super(respostaAPI);
    }

    @Override
    public void responderRequest() {
        System.out.println("Essa outra API está fornecendo:");
        respostaAPI.responderRequest();
    }
}
