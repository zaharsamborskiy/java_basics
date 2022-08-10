public class InformationAccumulator {
    private final InfoAccumulatorType infoAccumulatorType;
    private final int memorySize;
    private double weight;

    public InformationAccumulator(InfoAccumulatorType infoAccumulatorType, int memorySize, double weight) {
        this.infoAccumulatorType = infoAccumulatorType;
        this.memorySize = memorySize;
        this.weight = weight;
    }
    public InformationAccumulator setNewinfoAccumulatorType(InfoAccumulatorType infoAccumulatorType) {
        return new InformationAccumulator(infoAccumulatorType, memorySize, weight);
    }
    public InformationAccumulator setNewNumberOfCores(int memorySize) {
        return new InformationAccumulator(infoAccumulatorType, memorySize, weight);
    }
    public InformationAccumulator setNewWeight(double weight) {
        return new InformationAccumulator(infoAccumulatorType, memorySize, weight);
    }

    public InfoAccumulatorType getInfoAccumulatorType() {
        return infoAccumulatorType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Information Accumulator = "
                + getInfoAccumulatorType()
                + " Type Accomulator, "
                + getMemorySize()
                + " TB Memory Size, "
                + getWeight()
                + " Weight, "
                + '\n'
                ;
    }
}
