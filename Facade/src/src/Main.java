package src;

public class Main {

    public static void main(String[] args) {
        FacadeGravarDados fgd = new FacadeGravarDados(new HardDisk(), new ReadCSVFile() , new BancoDeDados());
        fgd.gravarDadosDoCSV();
    }
}
