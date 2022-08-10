public class Keyboard {
    private final String type;
    private final boolean rgb;
    private double weight;

    public Keyboard(String type, boolean rgb, double weight) {
        this.type = type;
        this.rgb = rgb;
        this.weight = weight;
    }
    public Keyboard setNewType(String type) {
        return new Keyboard(type, rgb, weight);
    }
    public Keyboard setNewrgb(boolean rgb) {
        return new Keyboard(type, rgb, weight);
    }
    public Keyboard setNewWeight(double weight) {
        return new Keyboard(type, rgb, weight);
    }

    public String getType() {
        return type;
    }

    public boolean isRgb() {
        return rgb;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Keyboard = "
                + getType()
                + " Keyboard Type, "
                + isRgb()
                + " Get RGB, "
                + getWeight()
                + " Weight. "
                ;
    }
}
