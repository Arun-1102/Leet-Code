import java.lang.Math;
class Solution {
    public int scoreOfString(String s) {
        s=s.toLowerCase();
       int sum=0; 
        for(int i=0;i<s.length()-1;i++){
            sum=sum+(Math.abs((int)s.charAt(i)-(int)s.charAt(i+1)));
        }
        return sum;
    }
}