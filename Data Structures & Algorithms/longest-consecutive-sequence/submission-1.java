class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer num: nums){
            set.add(num);
        }
       int res=0;
        for(Integer num: set){
            if(!set.contains(num-1)){
                int c=1;
                int temp=num;
                while(set.contains(temp+1)){
                    c++;
                    temp++;                }
                    res=Math.max(res,c);
            }
        }
        return res;
    }
}
