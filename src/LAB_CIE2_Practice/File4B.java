package LAB_CIE2_Practice;

import java.io.*;

public class File4B {
    public static void main(String args[]) throws IOException
    {
        try
        {
            BufferedReader f1 = new BufferedReader(new FileReader("C:/Users/kapil/OneDrive/Desktop/Java/Labs/src/LAB_CIE2/Hello.txt"));
            String line = f1.readLine();
            for(int i=1;line != null;i++)
            {
                System.out.println(i + " " + line);
                line = f1.readLine();
            }
            f1.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not Found");
        }
    }
}