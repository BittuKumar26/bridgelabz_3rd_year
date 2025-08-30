import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    } 
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } 
        else if ((user.equals("rock") && computer.equals("scissors")) ||
                   (user.equals("paper") && computer.equals("rock")) ||
                   (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } 
        else {
            return "Computer";
        }
    } 
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (totalGames == 0) ? 0 : (userWins * 100.0 / totalGames);
        double compPercent = (totalGames == 0) ? 0 : (computerWins * 100.0 / totalGames);

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    } 
    public static void displayResults(String[][] gameResults, String[][] stats) { 
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s %-12s %-12s %-10s\n", 
                gameResults[i][0], gameResults[i][1], gameResults[i][2], gameResults[i][3]);
        } 
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-10s %-10s %-15s\n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[n][4];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) { 
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++; 
            gameResults[i][0] = String.valueOf(i + 1);   // Game Number
            gameResults[i][1] = userChoice;
            gameResults[i][2] = compChoice;
            gameResults[i][3] = winner;
        } 
        String[][] stats = calculateStats(userWins, computerWins, n);  
        displayResults(gameResults, stats);
    }
}
