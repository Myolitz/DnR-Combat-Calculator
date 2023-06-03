import java.util.Scanner;
import Characters.Players;
import CombatActions.Combat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many players are active?");
        int playerNum = input.nextInt();

        switch (playerNum) {
            case 1 -> {
                System.out.println("Enter Player 1's name");
                String name1 = input.next();
                Players Player1 = new Players(name1);
                Player1.setStats(input);
                Combat fight = new Combat(input, Player1);
            }
            case 2 -> {
                //TODO repeat same as above
            }
            case 3 -> {
                //TODO above
            }
            case 4 -> {
                //TODO @see case 2
            }
            default -> {
                System.out.println("Please input 1-4, or if you want more, edit the code :)"); //Make the git repo for this
            }
        }
        System.out.println("Enter Character Name:");
        String name = input.next();


        input.close();
    }
}