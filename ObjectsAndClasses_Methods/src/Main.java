public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk",40, 1, 0.2);
        basket.add("bread", 45, 1, 0.5);
        basket.print("");
        System.out.println("Общий вес корзины составляет: " + basket.getTotalWeight());

//        Arithmetic summ = new Arithmetic(20, 50);
//        System.out.println(summ.getTotalPrice());
//        System.out.println(summ.getMultiplyPrice());
//        System.out.println(summ.getMaxPriceMilk());
//        System.out.println(summ.getMaxPriceBread());
    }
}
