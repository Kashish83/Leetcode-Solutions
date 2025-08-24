class Solution {
    public String reverseWords(String s) {
        String words[]= s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            StringBuilder reverseWords = new   StringBuilder(word);
            reverseWords.reverse();
            sb.append(reverseWords).append(" ");
        }
        return sb.toString().trim();
    }
}