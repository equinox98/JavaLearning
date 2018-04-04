package com.thirdHomework;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //first
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.println("First exercise:"+Arrays.toString(arr));
        //second
        int arr1 = arr[0];
        arr[0] = arr[7];
        arr[7] = arr1;
        String result = Arrays.toString(arr);
        System.out.println("Second exercise:"+result);
        //third
        Scanner input = new Scanner(System.in);
        System.out.println("Third exercise:");
        System.out.println("Enter array value: ");
        int[] bigArray = new int[10];
        for (int i = 0; i < 10; i++)
            bigArray[i] = input.nextInt();
        int[] firstSmallArray, secondSmallArray;
        firstSmallArray= Arrays.copyOfRange(bigArray, 0, 5);
        secondSmallArray = Arrays.copyOfRange(bigArray, 5, 10);
        Arrays.sort(firstSmallArray);
        Arrays.sort(secondSmallArray);
        String firstSmallArrayString = Arrays.toString(firstSmallArray);
        String secondSmallArrayString = Arrays.toString(secondSmallArray);
        System.out.println(firstSmallArrayString);
        System.out.println(secondSmallArrayString);
        //fourth
        double arithmeticMean = Arrays.stream(bigArray).summaryStatistics().getAverage();
        System.out.println("Fourth exercise:");
        System.out.println("Arithmetic mean is " + arithmeticMean);
        //fifth,(1)
        System.out.println("Fifth exercise:");
        int b=1;
        for(int i=0;i<bigArray.length;i++){
        bigArray[i]=b;
        b++;
        System.out.print(bigArray[i]+", ");
        }
        System.out.println();
        System.out.println("Mirror array:");
        for(int i=bigArray.length-1;i>=0;--i){
        System.out.print(bigArray[i]+", ");
        }
    }
}
