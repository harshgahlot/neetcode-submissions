class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        for (int i=1; i<=nums.length-1;i++){
            if(cnt>0){
                return true;
            }
            else if(nums[i]==nums[i-1]){
                cnt++;
            }
        }
        if(cnt>0){
            return true;
        }
        return false;

    }
}
