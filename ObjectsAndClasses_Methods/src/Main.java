public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk",40, 2, 0.2);
        basket.add("bread", 45, 1, 0.5);
        Basket basket1 = new Basket();
        basket.add("Chiken", 350, 1, 0.8);
        basket.add("Energy drink", 100,2,0.5);
        basket.print("");

        System.out.println(
                "Общий вес корзин составляет: " + basket.getTotalWeight() + "\n"
                        + "Количество корзин: " + Basket.getCount() + "\n"
                        + "Общая стоимость продуктов в корзинах составляет: " + Basket.totalProductCost + "\n"
                        + "Общее количество продуктов во всех корзинах составляет: " + Basket.totalProductCount + "\n"
                        + "Средняя стоимость продуктов во всех корзинах составляет: " + Basket.getAverageProductCost() + "\n"
                        + "Средняя стоимость корзины составляет: " + Basket.getAverageCountBasket()
        );

//        Arithmetic summ = new Arithmetic(20, 50);
//        System.out.println(summ.getTotalPrice());
//        System.out.println(summ.getMultiplyPrice());
//        System.out.println(summ.getMaxPriceMilk());
//        System.out.println(summ.getMaxPriceBread());
    }
}
