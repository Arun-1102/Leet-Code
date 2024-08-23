class Solution {
    public int[] getConcatenation(int[] nums) {
        int j=nums.length;
        int[] arr=new int[j*2];

       for(int i=0;i<j;i++){
        arr[i]=nums[i];
        arr[i+j]=nums[i];
       }
       return arr;
    }
}