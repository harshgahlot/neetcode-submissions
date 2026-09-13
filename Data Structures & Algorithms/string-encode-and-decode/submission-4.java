class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String s: strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int len=0;
            while(str.charAt(i)!='#'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            String s=str.substring(i+1, i+1+len);
            strs.add(s);
            i=i+1+len;

        }
        return strs;
    }
}
