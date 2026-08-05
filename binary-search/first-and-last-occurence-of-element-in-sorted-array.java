//34. Find First and Last Position of Element in Sorted Array

//Approach: Using two binary searches, first to find the leftmost occurence of target and second one to find the rightmost occurence of target
// Time: O(log n) | Space: O(1)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = {-1, -1};

        int left = 0;
        int right = n - 1;
        int ans1 = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans1 = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        res[0] = ans1;

        left = 0;
        right = n - 1;
        int ans2 = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans2 = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        res[1] = ans2; 

        return res;
    }
}
