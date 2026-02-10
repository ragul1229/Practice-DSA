import java.util.*;
public class TwoSum {
    public static void main(String args[]){
        int[] arr = {2,7,11,15,1,8};
        Arrays.sort(arr);
        int target = 9;
       int left = 0;
       int right = arr.length - 1;
       List<List<Integer>> result = new ArrayList<>();
       while(left < right){
           List<Integer> list = new ArrayList<>();
           int sum = arr[left] + arr[right];
        if(sum ==  target){
            list.add(arr[left]);
            list.add(arr[right]);
            result.add(list);
            left++;
            right--;
        }
        else if(sum < target){
            left++;
        }else{
            right--;
        }
       }
       System.out.print(result);
    }
}
