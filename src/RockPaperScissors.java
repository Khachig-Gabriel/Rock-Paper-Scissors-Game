import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String answer = input.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock – paper – scissors, shoot!");
            String yourChoice = input.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);

        } else if (answer.equals("no")){
            System.out.println("Darn, some other time!");
            
        } else {System.out.println("Please enter a valid answer");}
        input.close();
    }
    public static String computerChoice(){
        double randomNumber = Math.random()*3;
        int round = (int) randomNumber;
        switch (round) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "not reachable"; }}

    public static String result (String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!"; }
        else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result ="You win!"; }
        else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!"; }


        else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            result = "You lose"; }
        else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            result = "You lose"; }
        else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You lose"; }

        else {result = "It's a tie.";}

        return result; }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You Chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
