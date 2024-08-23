import java.util.*;
import java.lang.Math;
class Solution {
    public int findPermutationDifference(String s, String t) {
        
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=0;j<t.length();j++){
                char k=t.charAt(j);
                if(c==k){
                sum=sum+Math.abs(i-j);
                break;
            }
        }
    }
    return sum;
}
}