class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
        int maxArea=0;

        while(left < right){
            int area=0;
            if(heights[right] > heights[left]){
                area=(right-left)*heights[left];
                left++;
              
            }

           else  if( heights[right] <= heights[left] ){
                area=(right-left)*heights[right];
                right--;
            }
            maxArea=Math.max(area,maxArea);

        }
        return maxArea;
    }
}
