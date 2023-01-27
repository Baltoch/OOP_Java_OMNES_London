/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5_1;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * a)	Create an interface MessageEncoder that has a single abstract method encode(plainText), where 
 * plainText is the message to be encoded. The method will return the encoded message
 * 
 * b)	Create a class SubstitutionCipher that implements the interface MessageEncoder. The constructor should 
 * have one parameter called shift. Define the method encode so that each letter is shifted by the value in shift. 
 * For example, if shift is 3, a will be replaced by d, b will be replaced by e, c will be replaced by f, and so on. 
 * (Hint: You may wish to define a private method that shifts a single character.) 
 * 
 * c)	Create a class ShuffleCipher that implements the interface MessageEncoder. The constructor should have
 * one parameter called ‘n’. Define the method encode so that the message is shuffled n times. To perform one shuffle,
 * split the message in half and then take characters from each half alternately. For example, if the message is abcdefghi,
 * the halves are abcde and fghi. The shuffled message is afbgchdie. (Hint: You may wish to define a private method that
 * performs one shuffle.)
 * 
 */

public class Tutorial5_1Q5 {
    public static void main(String[] args)
    {
        MessageEncoder[] encoders = new MessageEncoder[2];
        
        // Instance of SubstitutionCipher
        encoders[0] = new SubstitutionCipher(5);
        
        // Instance of ShuffleCipher
        encoders[1] = new ShuffleCipher(5);
        
        System.out.println("Message to encode : \"Abcdefghi\"");
        System.out.println("Message returned by  SubstitutionCipher (shift = 5) : " + encoders[0].encode("Abcdefghi"));
        System.out.println("Message returned by  ShuffleCipher (n = 5) : " + encoders[1].encode("Abcdefghi"));
    }
}


interface MessageEncoder {
    public abstract String encode(String plainText);
}

class SubstitutionCipher implements MessageEncoder {
    private int shift;
    
    public SubstitutionCipher(int shift)
    {
        this.shift = shift %('z' - 'a');
    }
    
    private char shiftChar(char toShift)
    {
        int shifted;
        if(toShift >= 'a' && toShift <= 'z')
        {
            shifted = shift + toShift;
            if(shifted > 'z')
            {
                shifted -= 'z'; 
            }
        }
        else if(toShift >= 'A' && toShift <= 'Z')
        {
            shifted = shift + toShift;
            if(shifted > 'Z')
            {
                shifted -= 'Z'; 
            }
        }
        else
        {
            shifted = ' ';
        }
        char out = (char) shifted;
        return out;
    }
    
    @Override
    public String encode(String plainText)
    {
        String encoded = "";
        for(int i = 0; i < plainText.length(); i++)
        {
            encoded += shiftChar(plainText.charAt(i));
        }
        return encoded;
    }
}

class ShuffleCipher implements MessageEncoder {
    int shuffle;
    
    public ShuffleCipher(int n)
    {
        shuffle = n;
    }
    
    private String shuffleOnce(String toShuffle)
    {
        int halfLength = toShuffle.length() / 2 + toShuffle.length() % 2;
        int i = 0;
        String shuffled = "";
        while(i < toShuffle.length())
        {
            if(i%2 == 0) shuffled += toShuffle.charAt(i/2);
            else shuffled += toShuffle.charAt(i/2 + halfLength);
            i++;
        }
        return shuffled;
    }
    
    @Override
    public String encode(String plainText)
    {
        for(int i = 0; i < shuffle; i++) plainText = shuffleOnce(plainText);
        return plainText;
    }
}