class Solution {
    public int maxArea(int[] heights) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = heights.length;

            int left = 0;
            int right = n-1;
            
            int maxArea=0;
            while(left<right){
                
                int h = Math.min(heights[left],heights[right]);
                int w = Math.abs(right-left);
                int area = h*w;
                 maxArea = Math.max(maxArea,area);
                
                // list.add(area);
                if(heights[left]<heights[right]){
                    left++;
                }else{
                    right--;
                }
                
            }
            return maxArea;
        
        // int max = 0;
        // for(int x:list){
        //     if(x>max){
        //         max = x;
        //     }
        // }
        // return max;
    }
}
