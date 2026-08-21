class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j=people.length-1;
        int c=0;
        int i=0;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                c++;
                i++;
                j--;
            }else{
                c++;
                j--;
            }
        }
        return c;
    }
}