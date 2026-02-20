import java.util.Scanner;

class main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String num, src_base, target_base;

        // prompt user for input
        System.out.print("Enter number: ");
        num = scn.nextLine();
        System.out.print("Enter source base: ");
        src_base = scn.nextLine();
        System.out.print("Enter target base: ");
        target_base = scn.nextLine();

        // call the convert funtion to change user input tp int type
        int[] arr_int = funcs.int_converter(num);

        int index = 0;
        while (index < arr_int.length)
        {
            System.out.print(arr_int[index]);
            index++;
        }
    }
}
