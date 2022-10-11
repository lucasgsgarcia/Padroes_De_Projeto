public class Main {

    public static void main(String[] args) {
        BancoDeDadosSingleton b2, b3;

        b2 = BancoDeDadosSingleton.recuperarInstancia();
        b3 = BancoDeDadosSingleton.recuperarInstancia();

        System.out.println(b2 + " é a mesma instância que " +  b3);
    }
}
