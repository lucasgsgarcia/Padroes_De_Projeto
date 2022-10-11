public class Uber implements Observador{
    @Override
    public void notify(Corrida corrida) {
        System.out.println("Corrida para Uber: " + corrida);
    }
}
