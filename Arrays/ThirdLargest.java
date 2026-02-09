public class ThirdLargest {
    public static void main (String args[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int[] numbers = {10, 5, 8, 20, 15};
        for(int num : numbers){
        if(num > first){
            third = second;
            second = first;
            first = num;
        }
        else if(num > second && num != first){
            third = second;
            second = num;
        }else if(num > third && num != second && num != first){
            third = num;
        }
    }
    System.out.println("Third largest number is: " + third);
    }
}
 