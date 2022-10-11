public class BancoDeDadosSingleton {
    public BancoDeDadosSingleton() {}

    private static BancoDeDadosSingleton banco = new BancoDeDadosSingleton();

    public static synchronized BancoDeDadosSingleton recuperarInstancia(){
        return banco;
    }
}
