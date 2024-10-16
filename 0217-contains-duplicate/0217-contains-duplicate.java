import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> obj =new HashSet <>();
            for(int number: nums)
            {
                if(!obj.add(number))
                    return true;
            }
        return false;
    }
}