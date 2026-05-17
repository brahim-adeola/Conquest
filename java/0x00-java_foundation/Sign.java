/**
 * Sign - check if a given int is positive, negative or zero
 *
 */

public class Sign
{
    void check(int num)
    {
        if (num < 0)
        {
            System.out.println(num + ": is negative");
        }
        else if (num > 0)
        {
            System.out.println(num + ": is positive");
        }
        else
            System.out.println(num + ": is zero");
    }
}
