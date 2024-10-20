class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length==0)
           return 0;
        int majority=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(majority==nums[i])
            {
                majority=nums[i];
                count+=1;
            }
            else
            {
                count-=1;
                if(count==0)
                {
                    majority=nums[i];
                    count=1;
                }
            }
        }
        return majority;
    }
}