class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        int res=0;
        for(int num: nums){ 
            hset.add(num);
        }
        for(int num: hset){
            if(!hset.contains(num-1)){
                int c=1;
                int temp=num;
                while(hset.contains(temp+1)){
                    c++;
                    temp++;
                }
                res=Math.max(res,c);
            }
        }
        return res;
    }
}
