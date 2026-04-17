import java.util.Scanner;


public class Game
{
    public static void main(String[] args)
    {
        Player player = new Player();

        player.gold = 100;
        player.food = 50;
        player.army = 10;

        for (int rd = 1; rd <= 3; rd++)
        {
            System.out.println("\n\t\t===================");
            System.out.println("ROUND " + rd);
            System.out.println("\t\t====================");

            player.showStatus();

            Scanner input = new Scanner(System.in);

            System.out.println("\nChoose an action");
            System.out.println("1. Build Farm");
            System.out.println("2. Train Army");
            System.out.println("3. Skip");
            
            System.out.print("Pick an option: ");
            int choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("You built a farm!");
                player.food += 20;
            }
            else if (choice == 2)
            {
                System.out.println("You trained soldiers!");
                player.army += 5;
                player.gold -= 20;
            }
            else
                System.out.println("You skipped the turn");

            System.out.println("\n\t\t\t****UPDATED STATUS****");
            player.showStatus();
        }
    }
}
