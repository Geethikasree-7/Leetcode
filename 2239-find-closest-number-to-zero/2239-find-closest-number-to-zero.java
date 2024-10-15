class Solution {
    public int findClosestNumber(int[] nums) {
        int closest=Integer.MAX_VALUE;
        
        if(nums==null||nums.length==0)
        {
            return 0;
        }
         for(int number:nums)
        {
        int currentNum=Math.abs(number);
            
        if (currentNum < Math.abs(closest) || 
               (currentNum == Math.abs(closest) && number > closest)) {
                closest = number; 
               }       
     }
            return closest;
    }       

}
