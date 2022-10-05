package src;

public class Main {

    public static void main(String[] args) {
	    RandomAcessMemory ram = new RandomAcessMemory();
        Processor cpu = new Processor();
        HardDisk hd = new HardDisk();
        PSU psu = new PSU();
        MotherBoard mb = new MotherBoard();

        ComputerComposite computer = new ComputerComposite("MEU PC", 5500);
        computer.addComponent(psu);
        computer.addComponent(mb);
        computer.addComponent(cpu);
        computer.addComponent(hd);
        computer.addComponent(ram);
        System.out.println(computer.toString());

        for (Component c : computer.componentes) {
            c.process();
        }
    }
}
