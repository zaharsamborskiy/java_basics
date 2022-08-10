public class Ram {
    private final String type;
    private final int volume;
    private double weight;

    public Ram(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public Ram setNewType(String type) {
        return new Ram (type,volume,weight);
    }
    public Ram setNewVolume(int volume) {
        return new Ram (type,volume,weight);
    }
    public Ram setNewWeight(double weight) {
        return new Ram (type,volume,weight);
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "RAM = "
                + getType()
                + " Type RAM, "
                + getVolume()
                + " Volume RAM, "
                + getWeight()
                + " Weight RAM, "
                + "\n"
                ;
    }
}
