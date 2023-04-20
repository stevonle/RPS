import java.util.Scanner;

public class Input {
    Scanner scan = new Scanner(System.in);

    public int enterChoice() {
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("rock")) {
            return 1;
        } else if (input.equalsIgnoreCase("paper")) {
            return 2;
        } else if (input.equalsIgnoreCase("scissor")) {
            return 3;
        } else {
            return 4;
        }
    }
}
