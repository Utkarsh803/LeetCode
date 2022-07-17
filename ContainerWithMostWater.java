class Solution {
    public int maxArea(int[] height) {
        int width=height.length;
        int max=0;
        int area=0;
        for(int i=0;i<width-1;i++){
            for(int j=i+1;j<width;j++){
            int hei=0;
                if(height[i]>=height[j]){
                    hei=height[j];
                }else{
                      hei=height[i];
                }
                area=hei*(j-i);
        if(area>max){
            max=area;
        }
        }
        
        }
        return max;
    }
}
//faster
class Solution {
    public int maxArea(int[] H) {
        int ans = 0, i = 0, j = H.length-1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        }
        return ans;
    }
}