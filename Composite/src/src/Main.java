package src;

public class Main {

    public static void main(String[] args) {
	    RandomAcessMemory ram = new RandomAcessMemory();
        Processor cpu = new Processor();
        HardDisk hd = new HardDisk();
        PSU psu = new PSU();
        MotherBoard mb = new MotherBoard();

        ComputerComposite computerComposite = new ComputerComposite("MEU PC", 5500);
        computerComposite.addComponent(psu);
        computerComposite.addComponent(mb);
        computerComposite.addComponent(cpu);
        computerComposite.addComponent(hd);
        computerComposite.addComponent(ram);
        computerComposite.process();
        System.out.println("\n\n\n\n");

        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        Teclado teclado = new Teclado();


        SetupCompletoComposite setupCompletoComposite = new SetupCompletoComposite("Meu PC Completo", computerComposite);
        setupCompletoComposite.addPeriferico(monitor);
        setupCompletoComposite.addPeriferico(mouse);
        setupCompletoComposite.addPeriferico(teclado);
        setupCompletoComposite.process();


    }
}
