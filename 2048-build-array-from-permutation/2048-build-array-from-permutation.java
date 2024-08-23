class Solution {
    public int[] buildArray(int[] nums) {
        int j=nums.length;
        int[] num=new int[j];
        for(int i=0;i<j;i++){
            num[i]=nums[nums[i]];
        }
        return num;
    }
}
