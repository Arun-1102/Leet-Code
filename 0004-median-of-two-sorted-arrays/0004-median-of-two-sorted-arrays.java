class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int t=nums1.length+nums2.length;
        int[] srt=new int[t];

        int q=0;
        for(int i=0;i<nums1.length;i++){
            srt[q]=nums1[i];
            q++;
        }
        for(int i=0;i<nums2.length;i++){
            srt[q++]=nums2[i];
        }

        Arrays.sort(srt);

        if(t%2!=0){
        float z=(float)srt[t/2];
        return z;
        }

        else{
            float x=((float)srt[t/2]+(float)srt[(t/2)-1])/2;
            return x;
        }
    }
}