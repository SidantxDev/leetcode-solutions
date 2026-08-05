//5. Longest Palindromic Substring

// Expand around every possible center to check both odd and even length palindromes.
// Whenever the current palindrome is longer than the previous longest one,
// update its start and end indices.
// Time: O(n^2) | Space: O(1)

class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            //if the palindrome is odd centred, going outwards in both direction
            int left=i;
            int right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left>end-start){
                    end=right;
                    start=left;
                }
                left--;
                right++;
            }

            //noe if palindrome is even centred then pick the two indices and traverse out
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left>end-start){
                    end=right;
                    start=left;
                }
                left--;
                right++;
            }
        }
        return s.substring(start,end+1);
    }
}
