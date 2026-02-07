//LeetCode 26. Remove Duplicates from Sorted Array
import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]){
        int[] arr = {1,1,1,2,3,4,4,5};
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }        System.out.println(i+1);   
        System.out.print(Arrays.toString(Arrays.copyOf(arr,i+1)));

    }
}
