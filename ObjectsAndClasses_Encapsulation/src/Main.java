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
        System.out.println("Инфо о товаре :" + "\n" + infoForCourier + dimensions);
        dimensions = dimensions.setHeigth(5);
        dimensions = dimensions.setWigth(6);
        dimensions = dimensions.setLength(4);
        infoForCourier = infoForCourier.setNewAddress("Moscow");
        infoForCourier = infoForCourier.setNewWeigth(3.8);
        System.out.println("Инфо о товаре :" + "\n" + infoForCourier + dimensions + "\n");


//        System.out.println(
//                "Информация о товаре:" + "\n"
//                + dimensions
//                + "Объем товара в кв. м. : " + dimensions.getDimensions() + "\n"
//                + "Вес товара: " + infoForCourier.getWeigth() + "\n"
//                + "Адрес доставки: " + infoForCourier.getAddress() + "\n"
//                + "Можно ли переворачивать: " + infoForCourier.isFlip() + "\n"
//                + "Номер регистрации: " + infoForCourier.getNumberRegistration() + "\n"
//                + "Является ли хрупким: " + infoForCourier.isFragilie() + "\n"
//        );

//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }
    }
}
