package HomeWork;


import lombok.Data;

import java.util.Random;
import java.util.stream.IntStream;

@Data
public class MontyHallGame {
    private final int carPosition;
    private int chosenDoor;
    private int revealedGoatDoor;

    public MontyHallGame() {
        carPosition = new Random().nextInt(3);
        chosenDoor = -1;
        revealedGoatDoor = -1;
    }

    public void chooseDoor(int door) {
        chosenDoor = door;
        do {
            revealedGoatDoor = new Random().nextInt(3);
        } while (revealedGoatDoor == carPosition || revealedGoatDoor == chosenDoor);
    }

    public boolean isCarBehindChosenDoor() {
        return chosenDoor == carPosition;
    }

    public boolean switchDoor() {
        chosenDoor = IntStream.range(0, 3)
                .filter(i -> i != chosenDoor && i != revealedGoatDoor)
                .findFirst()
                .orElse(-1);
        return isCarBehindChosenDoor();
    }
}

