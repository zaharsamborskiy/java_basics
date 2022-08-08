import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2,3,1);
        InfoForCourier infoForCourier = new InfoForCourier(
                dimensions,
                2.3,
                "address",
                true,
                "20-303-4432-1223",
                false);
        System.out.println(
                "Информация о товаре:" + "\n"
                + dimensions
                + "Объем товара в кв. м. : " + dimensions.getDimensions() + "\n"
                + "Вес товара: " + infoForCourier.getWeigth() + "\n"
                + "Адрес доставки: " + infoForCourier.getAddress() + "\n"
                + "Можно ли переворачивать: " + infoForCourier.isFlip() + "\n"
                + "Номер регистрации: " + infoForCourier.getNumberRegistration() + "\n"
                + "Является ли хрупким: " + infoForCourier.isFragilie() + "\n"
        );
        dimensions = dimensions.setHeigth(10);
        dimensions = dimensions.setWigth(20);
        dimensions = dimensions.setLength(25);
        infoForCourier.setNewWeigth(22.2);
        infoForCourier.setNewAddress("Moscow, street Pushkina, 3");
        System.out.println(
                "Информация о товаре:" + "\n"
                        + dimensions
                        + "Объем товара в кв. м. : " + dimensions.getDimensions() + "\n"
                        + "Вес товара: " + infoForCourier.getWeigth() + "\n"
                        + "Адрес доставки: " + infoForCourier.getAddress() + "\n"
                        + "Можно ли переворачивать: " + infoForCourier.isFlip() + "\n"
                        + "Номер регистрации: " + infoForCourier.getNumberRegistration() + "\n"
                        + "Является ли хрупким: " + infoForCourier.isFragilie()
        );

//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }
    }
}
