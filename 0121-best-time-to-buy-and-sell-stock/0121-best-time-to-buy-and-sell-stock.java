class Solution {
    public int maxProfit(int[] p) {
        
        int b=p[0];
        int pt=0;
        for(int i=0;i<p.length;i++){
            if(b>p[i])
            b=p[i];
            else if(p[i]-b>pt)
            pt=p[i]-b;
        }
        return pt;
    }
}