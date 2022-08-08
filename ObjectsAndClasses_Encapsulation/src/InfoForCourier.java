public class InfoForCourier {

    private final Dimensions dimensions;
    private final double weigth;
    private final String address;
    private final boolean flip;
    private final String numberRegistration;
    private final boolean fragilie;

    public InfoForCourier(
            Dimensions dimensions,
            double weigth,
            String address,
            boolean flip,
            String numberRegistration,
            boolean fragilie)
    {
        this.dimensions = dimensions;
        this.weigth = weigth;
        this.address = address;
        this.flip = flip;
        this.numberRegistration = numberRegistration;
        this.fragilie = fragilie;
    }
    public InfoForCourier setDimesions(Dimensions dimensions) {
        return new InfoForCourier(
                dimensions,
                weigth,
                address,
                flip,
                numberRegistration,
                fragilie
        );
    }
    public InfoForCourier setNewAddress(String address) {
        return new InfoForCourier(
                dimensions,
                weigth,
                address,
                flip,
                numberRegistration,
                fragilie
        );
    }
    public InfoForCourier setNewWeigth(double weigth) {
        return new InfoForCourier(
                dimensions,
                weigth,
                address,
                flip,
                numberRegistration,
                fragilie
        );
    }

    public double getWeigth() {
        return weigth;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlip() {
        return flip;
    }

    public String getNumberRegistration() {
        return numberRegistration;
    }

    public boolean isFragilie() {
        return fragilie;
    }
    public String toString(){
        return "Объем товара в кв. м. : " + dimensions.getDimensions() + "\n"
                + "Вес товара: " + getWeigth() + "\n"
                + "Адрес доставки: " + getAddress() + "\n"
                + "Можно ли переворачивать: " + isFlip() + "\n"
                + "Номер регистрации: " + getNumberRegistration() + "\n"
                + "Является ли хрупким: " + isFragilie() + "\n";
    }
}
