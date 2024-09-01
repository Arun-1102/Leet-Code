class Solution {
    public int maxDepth(String s) {
       int p=0,c=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                p++;
            if(s.charAt(i)==')')
                p--;
       
        c=Math.max(p,c);
    }
    return c;
    }
}