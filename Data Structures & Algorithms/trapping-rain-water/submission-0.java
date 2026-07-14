class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxl=height[l];
        int maxr=height[r];
        int rw=0;
        while(l<r){
            if(maxl<maxr){
                 l++;
                maxl=Math.max(maxl,height[l]);
                rw+=maxl-height[l];
               
            }else{
                r--;
                maxr=Math.max(maxr,height[r]);
                rw+=maxr-height[r]; 
                
            }
        }
        return rw;
    }
}
