class Solution {
    public int strStr(String h, String n) {
        int l=n.length();
        if(h.length()==1 && h.equals(n))
            return 0;
        

        for(int i=0;i<=h.length()-l;i++){
           int j=0;
           while(j<l && h.charAt(i+j)==n.charAt(j)){
           j++;}
           if(j==l)
           return i;
        }
        return -1;
    }
}