class Solution {
    public String minWindow(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for(char c:t.toCharArray()) mapT[c]++;
        
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for(int right = 0;right<s.length();right++){
            mapS[s.charAt(right)]++;
            while(contains(mapS,mapT)){
                if(right - left +1<minLen){
                    minLen = right-left+1;
                    start =  left;
                }
                mapS[s.charAt(left)]--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?"":s.substring(start,start+minLen);

        
    }
    private boolean contains(int[] mapS,int[] mapT){
        for(int i = 0;i<256;i++){
            if(mapS[i]<mapT[i]){
                return false;
            }
        }
        return true;
    }
}
