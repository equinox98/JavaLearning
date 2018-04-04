package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Print first second and third sentences:");
        Scanner scanner = new Scanner(System.in);
        // input
        String firstSentences = scanner.nextLine();
        String secondSentences = scanner.nextLine();
        String thirdSentences = scanner.nextLine();
        System.out.println("Your printed:" + firstSentences);
        System.out.println("Your printed:" + secondSentences);
        System.out.println("Your printed:" + thirdSentences);
        // output
        System.out.println("S1+s3:" + firstSentences + thirdSentences );
        System.out.println("s3+s2+s1:" + thirdSentences + secondSentences + firstSentences );
        System.out.println("S1+s2+s3:" + firstSentences + secondSentences + thirdSentences);
    }
}

