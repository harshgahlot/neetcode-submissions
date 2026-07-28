class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()){
            return "";
            }
        int[] need=new int[128];
        for(char c: t.toCharArray()){
            need[c]++;
        }
        int required = 0;
        for (int x : need)
            if (x > 0) required++;

        int[] window = new int[128];

        int have = 0;
        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            window[c]++;

            if (need[c] > 0 && window[c] == need[c])
                have++;

            while (have == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);
                window[remove]--;

                if (need[remove] > 0 && window[remove] < need[remove])
                    have--;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}