package Strings;
import java.util.*;

public class Vow_Cons_Spaces 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence = sc.nextLine();
        int vowel=0,consonant=0,digit=0,space=0;
        for(char c : (sentence.toLowerCase()).toCharArray())
        {
            if(Character.isDigit(c))
                digit+=1;
            else if(Character.isWhitespace(c))
                space+=1;
            else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowel+=1;
            else
                consonant+=1;
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);
        System.out.println("Digits : " + digit);
        System.out.println("Spaces : " + space);
        sc.close();
    }
}
