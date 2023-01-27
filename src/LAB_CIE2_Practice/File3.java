package LAB_CIE2_Practice;

import java.io.*;
import java.util.*;

public class File3 {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        File f = new File(s);
        System.out.println("File Exists : " + f.exists());
        System.out.println("File is readable : " + f.canRead());
        System.out.println("File is writable : " + f.canWrite());
        String filename = f.toString();
        String extension = filename.substring(filename.lastIndexOf('.')+1);
        System.out.println("File Type : " + extension);
        System.out.println("Length : " + f.length());
    }
}