class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] count = new int[26];
        int[] window = new int[26];
        for(char c:s1.toCharArray()){
            count[c-'a']++;
        }
        for(int i =0;i<s1.length();i++){
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count,window)) return true;

        for(int i = s1.length();i<s2.length();i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(count,window)) return true;
        }
        return false ;
    }
}
