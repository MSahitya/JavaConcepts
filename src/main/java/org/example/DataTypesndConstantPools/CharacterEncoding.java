package org.example.DataTypesndConstantPools;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharacterEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Hello, world! Hello WOrld";
        byte[] byteArray = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(byteArray));//Unicode Decimal Represetnation
        char[] chars = new char[]{'\u0097'};//Unicode Representation
        String str1 = new String(chars);
        System.out.println(str1);//[?]
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));//[63]
    }
}
        //Java Default Encoding is UTF-16 UNicode to deciam to binary[will be stored in memory]
/* The trickiness of this question lies in character encoding and how String to byte array conversion works. In this program, we are first creating a String from a character array, which just has one character '\u0097', after that, we are getting the byte array from that String and print that byte.

Since \u0097 is within the 8-bit range of byte primitive type, it is reasonable to guess that the str.getBytes() call will return a byte array that contains one element with a value of -105 ((byte) 0x97).

However, that's not what the program prints and that's why this question is tricky. As a matter of fact, the output of the program is operating system and locale dependent. On a Windows XP with the US locale, the above program prints [63], if you run this program on Linux or Solaris, you will get different values.

To answer this question correctly, you need to know about how Unicode characters are represented in Java char values and in Java strings, and what role character encoding plays in String.getBytes().

In simple word, to convert a string to a byte array, Java iterates through all the characters that the string represents and turn each one into a number of bytes and finally put the bytes together. The rule that maps each Unicode character into a byte array is called a character encoding.

So It's possible that if the same character encoding is not used during both encoding and decoding then the retrieved value may not be correct. When we call str.getBytes() without specifying a character encoding scheme, the JVM uses the default character encoding of the platform to do the job.

The default encoding scheme is an operating system and locale-dependent. On Linux, it is UTF-8 and on Windows with a US locale, the default encoding is Cp1252. This explains the output we get from running this program on Windows machines with a US locale.

No matter which character encoding scheme is used, Java will always translate Unicode characters not recognized by the encoding to 63, which represents the character U+003F (the question mark, ?) in all encodings.

*/