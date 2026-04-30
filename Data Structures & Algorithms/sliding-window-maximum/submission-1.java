class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res=new int[nums.length-k+1];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=nums.length-k+1;i++){
            for(int j=i-1;j<i+k-1;j++){
                max=Math.max(max,nums[j]);
            }
            res[i-1]=max;
            max=Integer.MIN_VALUE;
        }
        return res;
        }
        
    }

