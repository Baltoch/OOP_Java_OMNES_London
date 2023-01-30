/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_lecture_7_error_handling;


import java.io.*;
import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * File encryption is the science of writing the contents of a file in a secret code. Your encryption program should 
 * work like a filter, reading the contents of one file, modifying the data into a code, and then writing the coded contents
 * out to a second file. The second file will be a version of the first file, but written in a secret code. 
 * 
 * Although there are complex encryption techniques, you should come up with a simple one of your own. 
 * For example, you could read the first file one character at a time, and add 10 to the character code of each 
 * character before it is written to the second file. 
 * 
 */

public class Exercise3 {
    private static final int KEY = 10;
    
    private static char encryptChar(char toEncrypt)
    {
        return (char) (toEncrypt + KEY);
    }
    
    private static char decryptChar(char toDecrypt)
    {
        return (char) (toDecrypt - KEY);
    }
    
    private static String encryptString(String toEncrypt)
    {
        String encrypted = "";
        for(int i = 0; i < toEncrypt.length(); i++)
        {
            encrypted += encryptChar(toEncrypt.charAt(i));
        }
        return encrypted;
    }
    
    private static String decryptString(String toDecrypt)
    {
        String decrypted = "";
        for(int i = 0; i < toDecrypt.length(); i++)
        {
            decrypted += decryptChar(toDecrypt.charAt(i));
        }
        return decrypted;
    }
    
    private static void encryptFile(String nameOfFileToEncrypt, String nameOfOutputFile)
    {
        Scanner toEncryptScanner = null;
        PrintWriter encrypted = null;
        try
        {
           File toEncrypt = new File(nameOfFileToEncrypt);
           toEncryptScanner = new Scanner(toEncrypt); 
        }
        catch(IOException e)
        {
            System.out.println("Error: Source file not found");
        }
        try
        {
            encrypted = new PrintWriter(nameOfOutputFile);
        }
        catch(IOException e)
        {
            System.out.println("Error: Output file not found");
        }
        if(!(toEncryptScanner == null || encrypted == null))
        {
            while(toEncryptScanner.hasNext())
            {
                encrypted.println(encryptString(toEncryptScanner.nextLine()));
            }
            toEncryptScanner.close();
            encrypted.close();
        }   
    }
    
    private static void decryptFile(String nameOfFileToDecrypt, String nameOfOutputFile)
    {
        Scanner toDecryptScanner = null;
        PrintWriter decrypted = null;
        try
        {
           File toDecrypt = new File(nameOfFileToDecrypt);
           toDecryptScanner = new Scanner(toDecrypt); 
        }
        catch(IOException e)
        {
            System.out.println("Error: Source file not found");
        }
        try
        {
            decrypted = new PrintWriter(nameOfOutputFile);
        }
        catch(IOException e)
        {
            System.out.println("Error: Output file not found");
        }
        if(!(toDecryptScanner == null || decrypted == null))
        {
            while(toDecryptScanner.hasNext())
            {
                decrypted.println(decryptString(toDecryptScanner.nextLine()));
            }
            toDecryptScanner.close();
            decrypted.close();
        }   
    }
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String source, encrypted, decrypted;
        System.out.println("Enter the name of the source file (the file you want to encrypt):");
        source = keyboard.nextLine();
        System.out.println("Enter the name of the output file (encrypted file):");
        encrypted = keyboard.nextLine();
        System.out.println("Enter the name of the output file (decrypted file):");
        decrypted = keyboard.nextLine();
        encryptFile(source, encrypted);
        decryptFile(encrypted, decrypted);
    }
}


