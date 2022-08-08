public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    Elevator(int min, int max) {
        minFloor = min;
        maxFloor = max;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        return currentFloor = currentFloor - 1;
    }

    public int moveUp() {
        return currentFloor = currentFloor + 1;
    }

    public int move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Не существующий этаж");
            return floor;
        }
        if (floor == getCurrentFloor()) {
            System.out.println("Вы уже на этаже " + getCurrentFloor());
            return getCurrentFloor();
        }
        for (int i = currentFloor; i < floor; i = moveUp()) {
            System.out.println("Этаж " + currentFloor);
        }
        for (int j = currentFloor; j > floor; j = moveDown()) {
            System.out.println("Этаж " + currentFloor);
        }
        System.out.println("Этаж " + currentFloor);
        return currentFloor;
    }
}

