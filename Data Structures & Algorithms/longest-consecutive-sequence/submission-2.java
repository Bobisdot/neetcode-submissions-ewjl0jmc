class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }

        int longest = 0;
        
        for(int x:set){
            if(!set.contains(x-1)){
                int cur = x;
                int streak =1;
                while(set.contains(cur+1)){
                    cur++;
                    streak++;
                }
                longest = Math.max(longest,streak);

            }
        }
        return longest;
        
    }
}
