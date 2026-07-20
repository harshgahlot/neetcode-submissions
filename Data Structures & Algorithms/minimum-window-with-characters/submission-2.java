class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        HashMap<Character, Integer> hmap= new HashMap<>();
        int minSubStr=Integer.MAX_VALUE;
        for(char c: t.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        int l=0;
        int have=0;
        int need=hmap.size();
        int[] res={-1,-1};
        HashMap<Character,Integer> hmaps=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            hmaps.put(c,hmaps.getOrDefault(c,0)+1);

            if(hmap.containsKey(c) && hmaps.get(c).equals(hmap.get(c))){
                have++;
            }
            while(have==need){
                if((r-l+1)<minSubStr){
                    minSubStr=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char left=s.charAt(l);
                hmaps.put(left,hmaps.get(left)-1);
                if(hmap.containsKey(left) && hmaps.get(left) < hmap.get(left)){
                    have--;
                }
                l++;
            }
        }
        return minSubStr == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
