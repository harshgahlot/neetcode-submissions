class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<int[]> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            arr.add(new int[] {ent.getValue(),ent.getKey()});
        }
        arr.sort((a,b)-> b[0]-a[0]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
