package Strings;
import java.util.*;

public class Words 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence = sc.nextLine();
        int word_count = 0;
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i) == ' ')
                word_count+=1;
        }
        System.out.println("No. of words = " + (word_count+1));
        System.out.println("Sentence in upper case : " + sentence.toUpperCase());
        sc.close();
    }
}
