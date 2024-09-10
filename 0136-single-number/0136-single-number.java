class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
    
        for(int i=0;i<nums.length-1;i++){
            int f=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                nums[j]=0;
                f=1;
            }
            if(f==1)
            nums[i]=0;
        }
    }
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
    }
    return sum;
    }
}