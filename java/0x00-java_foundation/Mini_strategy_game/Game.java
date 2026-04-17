public class Game
{
    public static void main(String[] args)
    {
        Player player = new Player();

        player.gold = 100;
        player.food = 50;
        player.army = 10;

        System.out.println("Gold: " + player.gold);
        System.out.println("Food: " + player.food);
        System.out.println("Army: " + player.army);
    }
}
