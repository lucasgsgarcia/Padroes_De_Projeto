import java.util.ArrayList;
import java.util.List;

public class SeparadorDeCorridas implements Observado{

    List<Observador> observers = new ArrayList<>();

    public void novaCorrida(Corrida corrida){
        notificarObservadores(corrida);
    }

    @Override
    public void registrarObservador(Observador observador) {
        observers.add(observador);
    }

    public void notificarObservadores(Corrida corrida){
        for (Observador o : observers){
            o.notify(corrida);
        }
    }

}
