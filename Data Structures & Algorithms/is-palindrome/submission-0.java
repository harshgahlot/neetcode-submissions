class Solution {
    public boolean isPalindrome(String s) {
        String lc=s.toLowerCase();
        int j= s.length()-1;
        int i=0;
       while(i<j){
            if(!alnum(lc.charAt(i))){
                i++;
            }else if(!alnum(lc.charAt(j))){
                j--;
            }else if(lc.charAt(i)!=lc.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
            
    }
return true;
    
}
    public boolean alnum(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
}
}
