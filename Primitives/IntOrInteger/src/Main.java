public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (char one = 'А'; one <= 'Е'; one++) {
            for (int i = one; i <= one; i++) {
                System.out.println(one + " - " + i);
            }
        }
        for (char two = 'Ё'; two <= 'Ё'; two++) {
            for (int i = two; i <= two; i++) {
                System.out.println(two + " - " + i);
            }
        }
        for (char three = 'Ж'; three <= 'Я'; three++) {
            for (int i = three; i <= three; i++) {
                System.out.println(three + " - " + i);
            }
        }
        for (char four = 'а'; four <= 'е'; four++) {
            for (int i = four; i <= four; i++) {
                System.out.println(four + " - " + i);
            }
        }
        for (char five = 'ё'; five <= 'ё'; five++) {
            for (int i = five; i <= five; i++) {
                System.out.println(five + " - " + i);
            }
        }
        for (char six = 'ж'; six <= 'я'; six++) {
            for (int i = six; i <= six; i++) {
                System.out.println(six + " - " + i);
            }
        }


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
    }
}
