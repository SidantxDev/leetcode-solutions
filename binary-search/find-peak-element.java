//162. Find Peak Element

//Approach:
// Binary search: if nums[mid] < nums[mid + 1], the slope is going up,
// so a peak must exist on the right. Otherwise, mid itself may be a peak,
// so we keep the left half including mid. When left == right, that index is a peak.
// Time: O(log n) | Space: O(1)

class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}
