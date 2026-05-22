class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> sets = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!sets.add(nums[i])){
               return true;
            }  
        }
        return false;
        
    }
}