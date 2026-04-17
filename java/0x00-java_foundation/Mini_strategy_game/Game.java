import java.util.Scanner;


public class Game
{
    public static void main(String[] args)
    {
        Player player = new Player();

        player.gold = 100;
        player.food = 50;
        player.army = 10;

        player.showStatus();

        Scanner input = new Scanner(System.in);

        System.out.println("\nChoose an action");
        System.out.println("1. Build Farm");
        System.out.println("2. Train Army");
        System.out.println("3. Skip");

        int choice = input.nextInt();

        System.out.println("You chose: " + choice);

    }
}
