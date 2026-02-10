public class FirstNoneRepeating {
    public static void main(String args[]){
        String str = "programming";
        int[] freq = new int[256];
        for(int i = 0 ; i < str.length() ; i++){
            freq[str.charAt(i)]++;
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(freq[str.charAt(i)] == 1){
                System.out.print(str.charAt(i));
                break;
            }
        }
    }
    
}
