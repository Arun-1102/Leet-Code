class Solution {
    public int reverse(int x) {
        long sum=0;
        int rem;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
       
       if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE)
        return 0;
        if(x<0)
        return (int)sum*(-1);
        return (int)sum;
    }
}