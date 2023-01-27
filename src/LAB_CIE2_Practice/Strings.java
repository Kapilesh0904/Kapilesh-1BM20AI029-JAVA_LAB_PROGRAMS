package LAB_CIE2_Practice;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World!";

        // #1 Length
        System.out.println("Length of str1: " + str1.length());

        // #2 Concatenation
        String str3 = str1.concat(str2);
        System.out.println("Concatenated string: " + str3);

        // #3 String to CharArray()
        char[] charArray = str1.toCharArray();
        System.out.print("String as char array: ");
        for (char c : charArray)
            System.out.print(c + " ");
        System.out.println();

        // #4 String charAt()
        System.out.println("Third character of str1: " + str1.charAt(2));

        // #5 Java String compareTo()
        System.out.println("str1 compared to str2: " + str1.compareTo(str2));

        // #6 String contains()
        System.out.println("str1 contains 'ell': " + str1.contains("ell"));

        // #7 Java String split()
        String[] words = str3.split(" ");
        System.out.print("String split by space: ");
        for (String word : words)
            System.out.print(word + " ");
        System.out.println();

        // #8 Java String indexOf()
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));

        // #9 Java String toString()
        int i = 10;
        String str4 = Integer.toString(i);
        System.out.println("10 as a string: " + str4);

        // #10 String reverse()
        String str5 = new StringBuilder(str1).reverse().toString();
        System.out.println("Reverse of str1: " + str5);

        // #11 String replace()
        String str6 = str1.replace('e', 'a');
        System.out.println("str1 with 'e' replaced by 'a': " + str6);

        // #12 Substring Method()
        String str7 = str3.substring(6);
        System.out.println("Substring of str3 from index 6: " + str7);
    }
}
