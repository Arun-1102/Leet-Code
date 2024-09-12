class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s=new StringBuilder();
        int c=0;
        int i=a.length()-1;
        int j=b.length()-1;

        while(i>=0 || j>=0 || c==1){
            if(i>=0)
            c=c+a.charAt(i--)-'0';
            if(j>=0)
            c=c+b.charAt(j--)-'0';
            s.append(c%2);
            c/=2;
        }
        return s.reverse().toString();
    }
}