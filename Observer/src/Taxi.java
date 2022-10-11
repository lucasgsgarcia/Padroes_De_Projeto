public class Taxi implements Observador{
    @Override
    public void notify(Corrida corrida) {
        System.out.println("Corrida para Taxi: " + corrida);
    }
}
