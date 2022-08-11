public class Computer {

    public final String vendor;
    public final String name;
    public Cpu cpu;
    public Ram ram;
    public InformationAccumulator informationAccumulator;
    public Monitor monitor;
    public Keyboard keyboard;

    public static double totalWeight = 0;

    public Computer(String vendor, String name,Cpu cpu, Ram ram, InformationAccumulator informationAccumulator, Monitor monitor,Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.informationAccumulator = informationAccumulator;
        this.monitor = monitor;
        this.keyboard = keyboard;
        totalWeight = totalWeight;
    }


    public Computer setNewVendor(String vendor) {
        return new Computer (vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }
    public Computer setNewName(String name) {
        return new Computer(vendor, name, cpu, ram, informationAccumulator, monitor, keyboard);
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setInformationAccumulator(InformationAccumulator informationAccumulator) {
        this.informationAccumulator = informationAccumulator;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public static void setTotalWeight(double totalWeight) {
        Computer.totalWeight = totalWeight;
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
        return totalWeight * cpu.getWeight() + ram.getWeight() + informationAccumulator.getWeight() + monitor.getWeight() + keyboard.getWeight();
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

