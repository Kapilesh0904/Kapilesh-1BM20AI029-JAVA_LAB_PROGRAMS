package LAB_CIE2_Practice;

import java.io.*;

public class File4A {
    public static void main(String args[]) throws IOException
    {
        try
        {
            BufferedReader f1 = new BufferedReader(new FileReader("C:/Users/kapil/OneDrive/Desktop/Java/Labs/src/LAB_CIE2/Hello.txt"));
            int num_chars = 0,num_lines = 0,num_words = 0;
            String line = f1.readLine();
            while(line != null)
            {
                num_lines +=1;
                for(int i=0;i<line.length();i++)
                {
                    num_chars+=1;
                    if (line.charAt(i) == ' ')
                        num_words +=1;
                }
                num_words+=1;
                line = f1.readLine();
            }
            System.out.println("Lines = " + num_lines);
            System.out.println("Chars = " + num_chars);
            System.out.println("Words = " + num_words);
            f1.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
    }
}
