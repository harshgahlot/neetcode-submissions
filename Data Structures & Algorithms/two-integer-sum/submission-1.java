class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    l.add(i);
                    l.add(j);
                    break;
                }
            }
            if(l.size()!=0){
                    break;
                }
        }
        int[] arr=l.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
