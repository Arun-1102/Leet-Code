class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       /* ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                
                if(words[i].charAt(j)==x){
                list.add(i);
                break;
                }
            }
        }
        return list;*/
         List<Integer> indices = new ArrayList<>();
        String target = String.valueOf(x);  // Convert char to String

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(target)) {
                indices.add(i);
            }
        }

        return indices;
    }
}