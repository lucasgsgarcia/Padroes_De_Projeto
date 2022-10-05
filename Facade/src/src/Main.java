package src;

public class Main {

    public static void main(String[] args) {
        FacadeGravarDadosDeCSV fgd = new FacadeGravarDadosDeCSV(new HardDisk(), new ReadCSVFile() , new BancoDeDados());
        fgd.gravarDadosDoCSV();
    }
}
