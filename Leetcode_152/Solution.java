class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int mp=1;
        for(int i=0;i<nums.length;i++){
            mp=mp*nums[i];
            ans=Math.max(mp,ans);
            if(mp==0){
                mp=1;
            }
        }
        mp=1;
        for(int i=nums.length-1;i>=0;i--){
            mp=mp*nums[i];
            ans=Math.max(mp,ans);
            if(mp==0){
                mp=1;
            }
        }
        return ans;
    }
}