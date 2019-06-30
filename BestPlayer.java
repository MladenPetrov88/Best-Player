import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int topgoals = 0;
        String bestPlayername = "";
        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 10) {
                System.out.printf("%s is the best player!%n", input);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", goals);
                break;
            }
            if (goals > topgoals) {
                bestPlayername = input;
                topgoals = goals;
            }

            input = scanner.nextLine();

        }
        if (input.equals("END")) {
            if (topgoals >= 3) {
                System.out.printf("%s is the best player!%n", bestPlayername);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", topgoals);
            } else {
                System.out.printf("%s is the best player!%n", bestPlayername);
                System.out.printf("He has scored %d goals.", topgoals);
            }
        }

    }
}