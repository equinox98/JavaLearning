package equinox;

import java.util.Arrays;

public class TaskTwo {
    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        public void mirrorArray (){
            int arr1 = arr[0];
            arr[0] = arr[7];
            arr[7] = arr1;
            String result = Arrays.toString(arr);
            System.out.println("Second exercise:" + result);
        }
    }

