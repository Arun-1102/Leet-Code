class Solution {
    public int minLength(String s) {
        StringBuilder str=new StringBuilder(s);
       int f=1;

       while(f==1){ 
        f=0;
        for(int i=0;i<str.length()-1;i++){
        if(str.substring(i,i+2).equals("AB")|| str.substring(i,i+2).equals("CD"))
        {
            str.delete(i,i+2);
           f=1;
            break;
            }
             }
       }
        
        int q=str.length();
        return q;
    }
}