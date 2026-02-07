//Leetcode 27. Remove Element


public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }

        System.out.println(i);
        for (int k = 0; k < i; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
