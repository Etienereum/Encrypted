package com.orason;

public class Encrypt {
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;

    public Encrypt(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit) {
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
        this.thirdDigit = thirdDigit;
        this.fourthDigit = fourthDigit;
    }

    public void swap(){
        int first = (firstDigit + 7) % 10;
        int second = (secondDigit + 7) % 10;
        int third = (thirdDigit + 7) % 10;
        int four = (fourthDigit + 7) % 10;
        firstDigit =third;
        secondDigit = four;
        thirdDigit = first;
        fourthDigit = second;
        System.out.printf("\nThe Encrypted Data is:\n%d,\t%d,\t%d,\t%d\n",
                firstDigit, secondDigit, thirdDigit, fourthDigit);

        first = thirdDigit;
        second = fourthDigit;
        third = firstDigit;
        four = secondDigit;

        firstDigit = (first + 10) -7;
        secondDigit = (second + 10) -7;
        thirdDigit = (third + 10) -7;
        fourthDigit = (four + 10) -7;

        System.out.printf("\n\n\nThe decrypted Data is:\n%d,\t%d,\t%d,\t%d\n",
                firstDigit, secondDigit, thirdDigit, fourthDigit);
    }
}