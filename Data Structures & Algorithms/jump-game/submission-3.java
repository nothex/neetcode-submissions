class Solution {
    public boolean canJump(int[] nums) {
       int farthest=0;
       for(int i=0;i<nums.length;i++){
        if(farthest<i) return false;
        farthest=Math.max(farthest,nums[i]+i);
       }
       return true; 
    }
}

//  int goal=nums[nums.length-1];
//         for(int i=nums.length-1;i>=0;i--){
//             if(i+nums[i]>=goal){
//                 goal=i;
//             }
//         }
//         if(goal==0) return true ;
//         else return false;
