public class funcs
{
    public static int[] int_converter(String digits)
    {
        int index = 0;
        int len = digits.length();
        int[] arr_int = new int[len];

        while (index < len)
        {
            arr_int[index] = Character.getNumericValue(digits.charAt(index));
            index++;
        }
        return arr_int;
    }
}
