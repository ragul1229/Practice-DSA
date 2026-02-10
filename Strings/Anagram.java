public class Anagram {
    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";
        if(str1.length() != str2.length()){
            System.out.print("Not anagrams");
        }
        int[] freq = new int[256];
        for(int i = 0 ; i < str1.length() ; i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        
        for(int f: freq){
            if(f != 0){
                System.out.print("Not anagrams");
                return;
            }
        }
        System.out.print("Anagrams");
}
}