public class Aeronave implements OpsDeComunicacao{

    private String identificacao;


    public Aeronave() {}

    @Override
    public void operacao(String mensagem) {
        System.out.println("Recebendo mensagem: " + mensagem);
    }
}
