package APIs;

import RespostasAPI.RespostaAPI;

public abstract class API {

    protected RespostaAPI respostaAPI;

    public API(RespostaAPI respostaAPI) {
        this.respostaAPI = respostaAPI;
    }

    abstract public void responderRequest();
}
