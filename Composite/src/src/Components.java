package src;

interface Component{
    public void process();
}

class RandomAcessMemory implements Component{
    @Override
    public void process() {
        System.out.println("Salvando dados em memória volátil.");
    }
}

class Processor implements Component{
    @Override
    public void process() {
        System.out.println("Processando dados e resolvendo problemas lógicos.");
    }
}

class HardDisk implements Component{
    @Override
    public void process() {
        System.out.println("Salvando dados em memória não volátil.");
    }
}

class PSU implements Component{
    @Override
    public void process() {
        System.out.println("Fornecendo energia para a placa mãe.");
    }
}

class MotherBoard implements Component{
    @Override
    public void process() {
        System.out.println("Distribuindo energia e estabelecendo comunicação entre os componentes.");
    }
}

class Monitor implements Component{
    @Override
    public void process() {
        System.out.println("Exibindo dados.");
    }
}

class Teclado implements Component{
    @Override
    public void process() {
        System.out.println("Capturando movimentos físicos das teclas.");
    }
}

class Mouse implements Component{
    @Override
    public void process() {
        System.out.println("Capturando movimentos em coordenadas X e Y.");
    }
}

