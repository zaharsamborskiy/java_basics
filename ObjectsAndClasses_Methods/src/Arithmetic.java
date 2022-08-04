public class Arithmetic {
    private int bread;
    private int milk;
    private int breadPlusMilk = 0;
    private int breadMultiplyMilk = 0;

    public Arithmetic(int priceBread, int priceMilk) {
        bread = priceBread;
        milk = priceMilk;
    }
    public int getTotalPrice() {
        breadPlusMilk = bread + milk;
        return breadPlusMilk;
    }

    public int getMultiplyPrice() {
        breadMultiplyMilk = bread * milk;
        return breadMultiplyMilk;
    }

    public int getMaxPriceMilk() {
        if (milk >= bread) {
            return milk;
        } else {
            return bread;
        }
    }

    public int getMaxPriceBread() {
        if (milk <= bread) {
            return milk;
        } else {
            return bread;
        }
    }
}
