//2149. Rearrange Array Elements by Sign

// Store the positive and negative numbers separately while preserving their original order.
// Then place positives at even indices and negatives at odd indices to rearrange the array.
// Time: O(n) | Space: O(n)

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int[] p_nums=new int[len/2];
        int[] n_nums=new int[len/2];
        int p=0;
        int n=0;
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                p_nums[p]=nums[i];
                p++;
            }
            else{
                n_nums[n]=nums[i];
                n++;
            }
        }p=0; n=0;
        for(int j=0;j<len;j++){
            if(j%2==0){
                nums[j]=p_nums[p];
                p++;
            }
            else{
                nums[j]=n_nums[n];
                n++;
            }
        }
        return nums;
    }
}
