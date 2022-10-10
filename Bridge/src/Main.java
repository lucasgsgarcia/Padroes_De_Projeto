import APIs.API;
import APIs.AlgumaAPI;
import APIs.OutraAPI;
import RespostasAPI.JSONResponse;
import RespostasAPI.XMLResponse;

public class Main {

    public static void main(String[] args) {
        API umaAPI = new AlgumaAPI(new XMLResponse());
        umaAPI.responderRequest();

        API outraAPI = new OutraAPI(new JSONResponse());
        outraAPI.responderRequest();
    }
}
