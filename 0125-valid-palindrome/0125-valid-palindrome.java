class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder original=new StringBuilder();
        char[] array=s.toCharArray();
        if(s=="null"||s.isEmpty())
        {
            return true;
        }
        else
        {
            for(int i=0;i<array.length;i++)
            {
                if(Character.isLetterOrDigit(array[i]))
                {
                    original.append(array[i]);
                }

            }
            String word=original.toString();
            String rev=original.reverse().toString();
            String word1=word.toLowerCase();
            String rev1=rev.toLowerCase();
            return word1.equals(rev1);
        }
        
    }
}