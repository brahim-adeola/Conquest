/**
 * NumRank - Find the largest and smallest of 3 numbers
 *
 */

public class NumRank
{
    public int[] search(int num1, int num2, int num3)
    {
        int largest = Math.max(Math.max(num1, num2), num3);
        int smallest = Math.min(Math.min(num1, num2), num3);

        return new int[]{largest, smallest};
    }
}
