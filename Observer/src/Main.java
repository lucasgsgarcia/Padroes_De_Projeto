public class Main {

    public static void main(String[] args) {
        SeparadorDeCorridas sdc = new SeparadorDeCorridas();

        Taxi taxi = new Taxi();
        Uber uber = new Uber();

        sdc.registrarObservador(taxi);
        sdc.registrarObservador(uber);

        sdc.notificarObservadores(new Corrida());

    }
}
