package Strings;
import java.util.*;

public class Reverse_Odd 
{
    public static void main(String[] args) 
    {
        String s;
        System.out.println("Enter a string");
        Scanner so=new Scanner(System.in);
        s = so.nextLine();
        System.out.println("\nOriginal text: " + s);
        System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(s));
        so.close();
    }
    public static String test(String str) 
    {
       String[] str_words = str.split(" ");
       for (int i = 0; i < str_words.length; i++) 
       {
            if (str_words[i].length() % 2 != 0) 
            {
                StringBuilder reverser = new StringBuilder(str_words[i]);
                str_words[i] = reverser.reverse().toString();
            }
       }
       return String.join(" ", str_words);
    }
}