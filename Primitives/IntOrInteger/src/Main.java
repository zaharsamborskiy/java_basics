public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (char one = 'А'; one <= 'Е'; one++) {
            System.out.println(one);
        }
        for (char two = 'Ё'; two <= 'Ё'; two++) {
            System.out.println(two);
        }
        for (char three = 'Ж'; three <= 'Я'; three++) {
            System.out.println(three);
        }
        for (char four = 'а'; four <= 'е'; four++) {
            System.out.println(four);
        }
        for (char five = 'ё'; five <= 'ё'; five++) {
            System.out.println(five);
        }
        for (char six = 'ж'; six <= 'я'; six++) {
            System.out.println(six);
        }


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
    }
}
