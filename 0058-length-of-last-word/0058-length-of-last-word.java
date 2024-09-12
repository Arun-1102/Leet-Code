class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int j=0;;
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                j++;
            }
            else{
                break;
            }
        }
       return j;
    }
}