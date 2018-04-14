package equinox;

import java.util.Scanner;

public class arrayInput {
    public static int[] bigArray;
    public static int[] input (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array values: ");
        bigArray = new int[10];
        for (int i = 0; i < bigArray.length; i++)
            bigArray[i] = input.nextInt();
        return bigArray;
    }
}
