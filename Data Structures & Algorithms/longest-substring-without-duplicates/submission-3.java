class Solution {
    public int lengthOfLongestSubstring(String s) {
      boolean[] visited = new boolean[128];
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            int c = (int) s.charAt(right);
            while (left < right && visited[c]) {
                visited[(int) s.charAt(left)] = false;
                left++;
            }

            visited[c] = true;
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
