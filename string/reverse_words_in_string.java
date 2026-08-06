//151. Reverse Words in a String

// Trim the string, split it into words by handling multiple spaces,
// then append the words in reverse order using a StringBuilder.
// Time: O(n) | Space: O(n)

class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();
        
    }
}
