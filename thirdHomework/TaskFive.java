package equinox;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
    public void mirrorArray() {
        System.out.println("Fifth exercise:");
        for (int i = 0; i < arrayInput.bigArray.length; i++) {
            System.out.print(arrayInput.bigArray[i] + ", ");
        }
        System.out.println();
        System.out.println("Mirror array:");
        for (int i = arrayInput.bigArray.length - 1; i >= 0; --i) {
            System.out.print(arrayInput.bigArray[i] + ", ");
        }
    }
    public void findingItems() {
        System.out.println("\nEnter number of elements in the array: \n");
        Scanner s = new Scanner(System.in);
        int NumbersInArray = s.nextInt();
        int newArray[];
        newArray = new int[NumbersInArray];
        System.out.println("Enter array values: ");
        Scanner inputNewArray = new Scanner(System.in);
        for (int i = 0; i < NumbersInArray; i++){
            newArray[i] = inputNewArray.nextInt();
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("Enter the index of the desired item: ");
        Scanner index = new Scanner(System.in);
        int indexOfNewArray = index.nextInt();
        int indexOfNewArrayWithNewCounter = indexOfNewArray - 1;
        if (NumbersInArray == indexOfNewArray) {
            System.out.println("Item which is interested for you:");
            System.out.print(newArray[indexOfNewArrayWithNewCounter]);
        }
        else {
            System.out.println("Incorrect input!!!");
        }
    }
}
