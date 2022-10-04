package src;

public class Main {

    public static void main(String[] args) {
	CorrenteContinua cc = new CorrenteContinua();

    AdapterContinuaParaAlternada adapter = new AdapterContinuaParaAlternada(cc);
    // Conectando rede contínua em alternada através de adaptador
    adapter.conectarNaRede();
    }
}


