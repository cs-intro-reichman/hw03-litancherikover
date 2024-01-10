public class UniqueChars 
{
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) 
    {
        //Here we defined the empty string which will be converted to string without duplicates
        String WithoutDuplicates = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            //In case the char is space
            if (ch == ' ') 
            {
                WithoutDuplicates += " ";
            } 
            //if the char is not in the string, the function will return -1
            else if (WithoutDuplicates.indexOf(ch) == -1) 
            {
                WithoutDuplicates += ch;
            } 
        }
        return WithoutDuplicates;
    }
}
