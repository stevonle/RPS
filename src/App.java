import java.util.Random;

public class App {
    private Random random = new Random();
    private Input input = new Input();
    private Output output = new Output();
    private int numOfGames = 0;
    private int numOfWins = 0;
    private int numOfTies = 0;

    public void run() {
        while (true) {
            output.displayStart();

            int choice = input.enterChoice();
            output.displayChoice(choice);
            if (choice == 4) {
                continue;
            }

            int cpuChoice = random.nextInt(1,4);
            output.displayCpuChoice(cpuChoice);

            String wonGame = output.displayResults(choice, cpuChoice);

            numOfGames++;
            if (wonGame.equals("draw")) {
                numOfTies++;
            } else if (wonGame.equals("win")) {
                numOfWins++;
            }
            output.displayGames(numOfGames, numOfWins, numOfTies);
        }
    }
}
