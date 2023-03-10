public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;


    public static int totalProductCount;
    public static int totalProductCost;
    private static int averageProductCost;
    private static int averageCountBasket;



    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 0);
    }
    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. " + " Вес товара составляет : " + weight;

        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight * count;
        Basket.totalProductCount = Basket.totalProductCount + count;
        Basket.totalProductCost = Basket.totalProductCost + totalPrice;
    }

    public int getTotalProductCount() {
        return totalProductCount;
    }
    public int getTotalProductCost() {
        return totalProductCost;
    }
    public static int getAverageProductCost() {
        return averageProductCost = Basket.totalProductCost / Basket.totalProductCount;
    }
    public static int getAverageCountBasket() {
        return averageCountBasket = Basket.totalProductCost / getCount();
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public double getTotalWeight(){
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
