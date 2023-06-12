 class Solution {
    public int removeDuplicates(int[] nums) {
        int x=1;
         
        for(int i=x ;i<nums.length;i++)
        {
            if(nums[i]!=nums[x-1])
            {
                nums[x++]=nums[i];
            }
        }
        return x;
    }
}



class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0)
        {
            return false;
        }
        return true;
    }
}