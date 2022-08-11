public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(2.4,6, "Intel",0.45);
        Ram ram = new Ram("DDR5", 16, 0.40);
        InformationAccumulator informationAccumulator = new InformationAccumulator(InfoAccumulatorType.SSD,1,200.0);
        Monitor monitor = new Monitor(24.5,MonitorType.IPS,5.1);
        Keyboard keyboard = new Keyboard("Mechanical",true,340.0);
        Computer computer = new Computer(" USA ", " MSI ", cpu, ram, informationAccumulator, monitor,keyboard);
        System.out.println(
                "Info about computer: "
                + computer
                + cpu
                + ram
                + informationAccumulator
                + monitor
                + keyboard
                +  "\n"
                + "Total weight computer "
                + computer.getTotalWeight()
                + "\n"
        );


        computer = computer.setNewName("HyperPC");
        cpu = cpu.setNewFrequency(3.2);
        informationAccumulator = informationAccumulator.setNewinfoAccumulatorType(InfoAccumulatorType.HDD);
        monitor = monitor.setNewMonitorType(MonitorType.VA);
        keyboard = keyboard.setNewType("membranous");
        ram = ram.setNewVolume(8);
        System.out.println(
                "Info about changed computer 1 : "
                        + computer
                        + cpu
                        + ram
                        + informationAccumulator
                        + monitor
                        + keyboard
                        +  "\n"
                        + "Total weight computer "
                        + computer.getTotalWeight() + "\n"
        );


        Computer computer2 = new Computer("Rissia","Razer", cpu,ram,informationAccumulator,monitor,keyboard);
        computer = computer.setNewVendor("China");
        cpu = cpu.setNewManufacturer("AMD");
        monitor = monitor.setNewMonitorType(MonitorType.TN);
        monitor = monitor.setNewDiagonal(27.0);
        monitor = monitor.setNewWeight(50.0);
        computer.setCpu(cpu.setNewFrequency(3.2));
        computer.setRam(ram.setNewType("DDR4"));
        computer.setInformationAccumulator(informationAccumulator.setNewWeight(100.0));
        System.out.println(
                "Info about computer 2 : "
                        + computer2
                        + computer.getCpu()
                        + computer.getRam()
                        + computer.getInformationAccumulator()
                        + computer.getMonitor()
                        + computer.getKeyboard()
                        +   "\n" + "Total weight computer "
                        + computer.getTotalWeight()
        );
    }
}
