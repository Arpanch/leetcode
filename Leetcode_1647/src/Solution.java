import java.util.Arrays;

class Solution {
    public int minDeletions(String s) {
		int freq[]= new int[26];
        for(char in : s.toCharArray()){
            freq[in-'a']++;
        }
        Arrays.sort(freq);
        int totalNoOfDeletions=0;
        for(int i=24;i>=0;i--){
            if(freq[i]==0){
                break;
            }
            while(freq[i]>=freq[i+1] && freq[i]!=0){
                totalNoOfDeletions++;
                freq[i]--;
            }
        }
        return totalNoOfDeletions;
 	}
    public static void main(String[] args) {
		System.out.println(new Solution().minDeletions("aabbc"));
	}
    
}