public class Output {

    public void displayStart() {
        System.out.print("Enter Rock, Paper, or Scissor: ");
    }

    public void displayChoice(int choice) {
        if (choice == 1) {
            System.out.println("You chose Rock");
        } else if (choice == 2) {
            System.out.println("You chose Paper");
        } else if (choice == 3) {
            System.out.println("You chose Scissor");
        } else {
            System.out.println("Invalid choice");
            System.out.println();
        }
    }

    public void displayCpuChoice(int cpuChoice) {
        if (cpuChoice == 1) {
            System.out.println("CPU chose Rock");
        } else if (cpuChoice == 2) {
            System.out.println("CPU chose Paper");
        } else {
            System.out.println("CPU chose Scissor");
        }
    }

    public String displayResults(int choice, int cpuChoice) {
        if (choice == cpuChoice) {
            System.out.println("You drawed");
            return "draw";
        } else if (choice == 3 && cpuChoice == 1) {
            System.out.println("You lost");
            return "lose";
        } else if (choice == 1 && cpuChoice == 3) {
            System.out.println("You won");
            return "win";
        } else if (choice > cpuChoice) {
            System.out.println("You won");
            return "win";
        } else {
            System.out.println("You lost");
            return "lose";
        }
    }

    public void displayGames(int numOfGames, int numOfWins, int numOfTies) {
        System.out.println("You've won " + numOfWins + " out of " + numOfGames + " games");
        if (numOfTies > 0) {
            System.out.println("You've tied " + numOfTies + " out of " + numOfGames + " games");
        }
        System.out.println();
    }
}
