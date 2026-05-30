/**
 * ceaserCipher - Encrypt alphabetic charactwrs by shift positions
 *
 * @message: string of characters to be encrypted
 * @shift: number position for shifting each letter forward
 *
 * Return: Encrypted string
 */

public class ceaserCipher
{
    public static String encryptMessage(String message, int shift)
    {
        StringBuilder e_text = new StringBuilder();

        for (int i = 0; i < message.length(); i++)
        {
            if (Character.isUpperCase(message.charAt(i)))
            {
                char ch = (char) (((int) message.charAt(i) + shift - 65) % 26 + 65);
                e_text.append(ch);
            }
            else if (Character.isLowerCase(message.charAt(i)))
            {
                char ch = (char) (((int) message.charAt(i) + shift - 97) % 26 + 97);
                e_text.append(ch);
            }
            else
            {
                e_text.append(message.charAt(i));
            }
        }
        return e_text.toString();
    }
}
