class Solution {
    public int maxArea(int[] heights) {
        int max=-1;
        int i=0;
        int j= heights.length;
        while(i<j){
            max=Math.max(max,((j-(i+1))*Math.min(heights[i],heights[j-1])));
            if(heights[i]<heights[j-1]){
                i++;
            }else if(heights[i]>heights[j-1]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
