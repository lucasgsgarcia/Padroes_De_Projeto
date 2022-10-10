package APIs;

import RespostasAPI.RespostaAPI;

public class AlgumaAPI extends API{
    public AlgumaAPI(RespostaAPI respostaAPI) {
        super(respostaAPI);
    }

    @Override
    public void responderRequest() {
        System.out.println("Essa API está fornecendo:");
        respostaAPI.responderRequest();
    }
}
