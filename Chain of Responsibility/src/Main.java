import java.util.Scanner;

class CaixaEletronicoChain{
    private SaqueChain saqueChain100;

    public CaixaEletronicoChain() {
        this.saqueChain100 = new Entregador100Reais();
        SaqueChain saqueChain50 = new Entregador50Reais();
        SaqueChain saqueChain20 = new Entregador20Reais();
        SaqueChain saqueChain10 = new Entregador10Reais();
        SaqueChain saqueChain5 = new Entregador5Reais();

        saqueChain10.setProximo(saqueChain5);
        saqueChain20.setProximo(saqueChain10);
        saqueChain50.setProximo(saqueChain20);
        saqueChain100.setProximo(saqueChain50);
    }

    public static void main(String[] args) {
        CaixaEletronicoChain caixaEletronico = new CaixaEletronicoChain();
        while (true) {
            int quantia = 0;
            System.out.println("Nova quantidade a ser sacada:");
            Scanner sc = new Scanner(System.in);
            quantia = sc.nextInt();
            if (quantia % 5 != 0) {
                System.out.println("Quantidade precisa ser múltiplo de 5.");
                return;
            }
            caixaEletronico.saqueChain100.entregar(new Saque(quantia));
        }
    }
}