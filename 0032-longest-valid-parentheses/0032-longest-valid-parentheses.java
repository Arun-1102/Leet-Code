class Solution {
    public int longestValidParentheses(String s) {
        int c=0;
        int r=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(k=='(')
            l++;
            else
            r++;
             if(l==r)
            c=Math.max(c,2*l);
            else if(r>l){
                l=0;
                r=0;
            }

        }
       l=0;r=0; 
        for(int i=s.length()-1; i>=0; i--){
            char k= s.charAt(i);
            if(k=='(')
                l++;
            else if(k==')')
                r++;
            

            if(l==r)
                c=Math.max(c,2*l);
             else if(r<l){
                r=0;
                l=0;
            }
        }
        
    return c;
    }
}