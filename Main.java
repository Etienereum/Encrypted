package com.orason;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\tPlease,\n\tEnter numbers between 3 - 12\n\n");

        System.out.println("Enter the 1st-Integer");
        int firstDigit = scan.nextInt();

        System.out.println("Enter the 2nd-Integer");
        int secondDigit = scan.nextInt();

        System.out.println("Enter the 3rd-Integer");
        int thirdDigit = scan.nextInt();

        System.out.println("Enter the 4th-Integer");
        int fourthDigit = scan.nextInt();

        Encrypt Case1 = new Encrypt(firstDigit, secondDigit, thirdDigit, fourthDigit);

        Case1.swap();

        System.out.println("\n\t*****THANK YOU*****\n");
    }
}
/*
(Enforcing Privacy with Cryptography) The explosive growth of Internet communication and data
storage on Internet-connected computers has greatly increased privacy concerns. The field of
cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate
a simple scheme for encrypting and decrypting data. A company that wants to send data over the
Internet has asked you to write a program that will encrypt it so that it may be transmitted more
securely. All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]

*/