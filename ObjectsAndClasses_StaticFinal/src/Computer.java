public class Computer {

    public final String vendor;
    public final String name;
    private final Cpu cpu;
    private final Ram ram;
    private final InformationAccumulator informationAccumulator;
    private final Monitor monitor;
    private final Keyboard keyboard;

    public static double totalWeight;

    public Computer(String vendor, String name,Cpu cpu, Ram ram, InformationAccumulator informationAccumulator, Monitor monitor,Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.informationAccumulator = informationAccumulator;
        this.monitor = monitor;
        this.keyboard = keyboard;
        totalWeight = cpu.getWeight() + ram.getWeight() + informationAccumulator.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    public Computer setNewVendor(String vendor) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewName(String name) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewCpu(Cpu cpu) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewRam(Ram ram) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewInformationAccumulator(InformationAccumulator informationAccumulator) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewMonitor(Monitor monitor) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewKeyboard(Keyboard keyboard) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public InformationAccumulator getInformationAccumulator() {
        return informationAccumulator;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public String toString() {
        return "" + '\n' +
                "Vendor = "
                + vendor
                + '\n'
                + "Name = "
                + name
                + '\n'
                ;
    }
}

