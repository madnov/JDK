package HomeWork;

public class Main {
    public static void main(String[] args) {
        MontyHallSimulator simulator = new MontyHallSimulator();
        simulator.runSimulation(1000);

        System.out.println("Wins: " + simulator.getWins());
        System.out.println("Losses: " + simulator.getLosses());

    }
}
