public class Cpu {
    private final double frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private double weight;


    public Cpu(double frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Cpu setNewFrequency(double frequency) {
        return new Cpu(frequency, numberOfCores, manufacturer, weight);
    }
    public Cpu setNewNumberOfCores(int numberOfCores) {
        return new Cpu(frequency, numberOfCores, manufacturer, weight);
    }
    public Cpu setNewManufacturer(String manufacturer) {
        return new Cpu(frequency, numberOfCores, manufacturer, weight);
    }
    public Cpu setNewWeight(double weight) {
        return new Cpu(frequency, numberOfCores, manufacturer, weight);
    }


    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "CPU = "
                + getFrequency()
                + " GHz, "
                + getNumberOfCores()
                + " Num. of Cores, "
                + getManufacturer()
                + " Manufaturer, "
                + getWeight()
                + " Weight, "
                + '\n'
                ;
    }
}

