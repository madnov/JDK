package HomeWork;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Data
public class MontyHallSimulator {
    private final List<Boolean> results = new ArrayList<>();

    public void runSimulation(int numGames) {
        for (int i = 0; i < numGames; i++) {
            MontyHallGame game = new MontyHallGame();
            game.chooseDoor(new Random().nextInt(3));
            results.add(game.switchDoor());
        }
    }

    public long getWins() {
        return results.stream().filter(result -> result).count();
    }

    public long getLosses() {
        return results.size() - getWins();
    }
}
