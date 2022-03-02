package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User is asked whether to Encrypt or Decrypt.
        System.out.println("Welcome to Caesar Cipher");
        System.out.println("To Encrypt press E & To Decrypt press D");

        Scanner keyboard = new Scanner(System.in);
        char Answer = keyboard.nextLine().charAt(0);

        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

        if (Answer == 'e') {
            System.out.println("Enter your message:");
            String plainText = keyboard.nextLine().toUpperCase();
            System.out.println("Enter shift amount from 1-29");
            int shift = keyboard.nextInt();
            // Each letter in plaintext
            for (int i = 0; i < plainText.length(); i++){
                // letterScanner
                // plainText.charAt(i);
                // lettersToNumbers + shift
                // alphabet.indexOf(plainText.charAt(i))+shift;
                // numberBackToLetters
                System.out.print(alphabet.charAt(alphabet.indexOf(plainText.charAt(i))+shift));
            }
        }

        if (Answer == 'd') {
            System.out.println("Enter your encrypted message:");
            String cipherText = keyboard.nextLine().toUpperCase();
            System.out.println("Enter shift amount of encryption from 1-29:");
            int shift = keyboard.nextInt();
            // Each letter in the ciphertext
            for (int i = 0; i < cipherText.length(); i++){
                // letterScanner
                // ciphertext.charAt(i);
                // lettersToNumbers - shift
                // alphabet.indexOf(ciphertext.charAt(i))+shift;
                // numberBackToLetters
                System.out.print(alphabet.charAt(alphabet.indexOf(cipherText.charAt(i))-shift));
            }
        }
    }
}
