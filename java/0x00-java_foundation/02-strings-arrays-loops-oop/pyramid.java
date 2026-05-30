/**
 * pyramud - Print a number pyramid pattern
 *
 * @n: length of pyramid column
 */

public class pyramid
{
    public static void printPyramid(int n)
    {
        if (n <= 0)
        {
            return;
        }
        for ( int row = 1; row <= n; row++)
        {
            for (int col = 0; col < row; col++)
            {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
