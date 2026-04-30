class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int []topf=new int[k];
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++){
        int ke=-1;
        int res=Integer.MIN_VALUE;
        for(int num:nums){
            if(map.get(num)>res)
              {res=map.get(num);
              ke=num;}
        }
        map.put(ke,0);
        topf[i]=ke;
        
        }
    return topf;
}
}
