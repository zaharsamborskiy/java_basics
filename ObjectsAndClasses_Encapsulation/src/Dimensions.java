public class Dimensions {

    private final  int heigth;
    private final int wigth;
    private final int length;

    public Dimensions(int heigth, int wigth, int length) {
        this.heigth = heigth;
        this.wigth = wigth;
        this.length = length;
    }
    public Dimensions setHeigth(int heigth) {
       return new Dimensions(heigth,wigth,length);
    }
    public  Dimensions setWigth(int wigth) {
        return new Dimensions(heigth,wigth,length);
    }
    public Dimensions setLength(int length) {
        return new Dimensions(heigth,wigth,length);
    }
    public int getDimensions() {
        return heigth * length * wigth;
    }
    public int getHeigth() {
        return heigth;
    }
    public int getWigth() {
        return wigth;
    }
    public int getLength() {
        return length;
    }
    public String toString() {
        return  "Объем товара в кв. м. : " + getDimensions() + "\n" +
                "Высота товара в м. : " + heigth + "\n" +
                "Ширина товара в м. : " + wigth + "\n" +
                "Длина товара в м. : " + length + "\n";
    }
}

