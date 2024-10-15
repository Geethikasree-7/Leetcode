void sortColors(int* nums, int numsSize) {
    if(numsSize==0)
    {
        return ;
    }
    for(int i=0;i<numsSize;i++)
    {
        for(int j=0;j<numsSize-1;j++)
        {
            if(nums[j]>nums[j+1])
                {
                    nums[j]=nums[j]+nums[j+1];
                    nums[j+1]=nums[j]-nums[j+1];
                    nums[j]=nums[j]-nums[j+1];
                }
            
        }
        
    }
    return ;
}
