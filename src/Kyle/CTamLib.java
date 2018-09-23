package Kyle;

public class CTamLib
{
    /*
        STRING METHODS
     */
    /*
        Input a string and isPalindrome will see if the reversed version of the string is the same string forward.
     */
    public static boolean isPalindrome(String str)
    {
        String temp = "";
        int x = 1;
        int y = 0;
        while (temp.length() < str.length()) 
        {
            temp = temp + str.substring(str.length() - x, str.length() - y);
            x++;
            y++;
        }
        if (temp.equals(str))
            return true;
        else
            return false;
    }

    /*
        Input a date and dateStr will return it in a different format (date-month-year).
     */
    public static String dateStr(String str)
    {
        String month = str.substring(0,2);
        String date = str.substring(3,5);
        String year = str.substring(6,10);
        return (date + " - " + month + " - " + year);
    }

    /*
        Input a string and word inside that string that you want to remove, and cutOut will return the new string with
        the word removed.
     */
    public static String cutOut(String a,String b)
    {
        for (int x = 0; x < a.length()-2; x++)
        {
            int y = x + b.length();
            if (a.substring(x,y).equals(b))
            {
                if (x == 0)
                    return (a.substring(y));
                else
                    return (a.substring(0,x) + a.substring(y));
            }
        }
        return a;
    }

    /*
        MATH METHODS
     */
    /*
        Input a number and isFibonacci will see if that number is part of the Fibonacci sequence.
     */
    public static boolean isFibonacci(int x)
    {
        int y = 0;
        int z = 0;
        int total = 1;
        if (x == total)
            return true;
        while (x > total)
        {
            y = z;
            z = total;
            total = y + z;
            if (x == total)
                return true;
        }
        return false;
    }

    /*
        Input a number and sumUpTo will return the sum of all the numbers counting to that number (inclusive).
     */
     public static int sumUpTo(int x)
     {
         int y = 0;
         int total = 0;
         while (y <= x)
         {
             total = total + y;
             y++;
         }
         return total;
     }

     /*
        CHALLENGE PROBLEMS
      */
     /*
        Input three words and stringUnion will return the number of unique letters shared by at least two of the words.
      */
     public static int stringUnion(String a, String b, String c)
     {
         int total = 0;
         String str = "";
         for (int x = 0; x < a.length()-1; x++)
         {
             if (b.indexOf(a.substring(x,x+1)) != -1 || c.indexOf(a.substring(x,x+1)) != -1)
             {
                 str = str + a.substring(x, x + 1);
                 total++;
             }
         }
         for (int y = 0; y < b.length()-1; y++)
         {
             if (a.indexOf(b.substring(y,y+1)) != -1 || c.indexOf(b.substring(y,y+1)) != -1)
             {
                 str = str + b.substring(y, y + 1);
                 total ++;
             }
         }
         for (int z = 0; z < c.length()-1; z++)
         {
             if (a.indexOf(c.substring(z,z+1)) != -1 || b.indexOf(c.substring(z,z+1)) != -1)
             {
                 str = str + c.substring(z, z + 1);
                 total ++;
             }
         }
         for (int k = 0; k < str.length()-1; k++)
         {
             if (str.lastIndexOf(str.substring(k,k+1)) != k)
                 total--;
         }
         return total;
     }

     /*
        Input three numbers and leastCommonMultiple will return the least common multiple of the three numbers.
      */
     public static int leastCommonMultiple(int x, int y, int z)
     {
         int a = 1;
         while (a < Integer.MAX_VALUE)
         {
             if (a%x == 0 && a%y == 0 && a%z == 0)
                 return a;
             else
                 a++;
         }
         return a;
     }
}
