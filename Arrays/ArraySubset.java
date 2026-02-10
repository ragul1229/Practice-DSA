import java.util.*;
public class ArraySubset {
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4};
        Arrays.sort(arr1);  
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                System.out.print("arr2 is not a subset of arr1");
            }
        }
        System.out.print(j == arr2.length ? "arr2 is a subset of arr1" : "arr2 is not a subset of arr1");    
    }
}