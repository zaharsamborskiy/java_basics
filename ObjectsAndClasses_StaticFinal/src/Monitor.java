public class Monitor {
    private final double diagonal;
    private final MonitorType monitorType;
    private double weight;

    public Monitor(double diagonal, MonitorType monitorType, double weight) {
        this.diagonal = diagonal;
        this.monitorType = monitorType;
        this.weight = weight;
    }
    public Monitor setNewDiagonal(double diagonal) {
        return new Monitor(diagonal, monitorType, weight);
    }
    public Monitor setNewMonitorType(MonitorType monitorType) {
        return new Monitor(diagonal, monitorType, weight);
    }
    public Monitor setNewWeight(double weight) {
        return new Monitor(diagonal, monitorType, weight);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "Monitor = "
                + getDiagonal()
                + " Diagonal monitor, "
                + getMonitorType()
                + " Matrix Type, "
                + getWeight()
                + " Weight, "
                + '\n'
                ;
    }
}
