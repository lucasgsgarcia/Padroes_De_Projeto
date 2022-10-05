package src;

class HardDisk{
    public void read(){
        System.out.println("Lendo arquivos do disco.");
    }
}

interface ReadFile{
    public String readFile(HardDisk hd);
}

class ReadCSVFile implements ReadFile{
    @Override
    public String readFile(HardDisk hd) {
        System.out.println("Lendo arquivo CSV do Disco Rígido.");
        return "";
        // Código implementado
    }
}

class BancoDeDados{
    public void insertData(String data){
        System.out.println("Inserindo dados no banco.");
    }
}

class FacadeGravarDadosDeCSV {
    private HardDisk hd = null;
    private ReadCSVFile leitorDeCSV = null;
    private BancoDeDados bancoDeDados = null;

    public FacadeGravarDadosDeCSV(HardDisk HD, ReadCSVFile leitorDeCSV, BancoDeDados bancoDeDados) {
        this.hd = HD;
        this.leitorDeCSV = leitorDeCSV;
        this.bancoDeDados = bancoDeDados;
    }

    public void gravarDadosDoCSV(){
        hd.read();
        String dados = leitorDeCSV.readFile(hd);
        bancoDeDados.insertData(dados);
    }
}

