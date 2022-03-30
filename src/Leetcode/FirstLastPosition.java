package Leetcode;

public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        // checking for first index of target
        int start = search(nums, target, true);

        // checking for last index of target
        int end  = search(nums, target, false);

        result[0] = start;
        result[1] = end;

        return result;
    }

    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1; // potential ans
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = end - (end - start)/2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
