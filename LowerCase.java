/** String processing exercise 1. */
public class LowerCase 
{
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s)
     {
        // First, we define an empty string which will contain given string but in lowercase 
        String LowerCase = "";
        //We are passing on all the given string's charecters
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if ((ch >= 65) && (ch <= 90)) 
            {
                //adding 32 to its ASCII value and converts to lowercase
                LowerCase += (char) (ch + 32);
            }
            else 
            {
                //adding 32 to its ASCII value and converts to lowercase
                LowerCase += ch;
            }
        }
        return LowerCase;
    }
}