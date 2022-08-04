public class Main {

    public static void main(String[] args) {
//        Basket basket = new Basket();
//        basket.add("Bread", 40);
//        basket.print("Bread");

        Arithmetic summ = new Arithmetic(20, 50);
        System.out.println(summ.getTotalPrice());
        System.out.println(summ.getMultiplyPrice());
        System.out.println(summ.getMaxPriceMilk());
        System.out.println(summ.getMaxPriceBread());
    }
}
