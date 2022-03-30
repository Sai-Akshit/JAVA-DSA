package Binary_Search;
//facebook question
public class FirstandLast {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,1};
        //check for first occurrence of target first
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public int search(int[] nums, int target, boolean findStartIndex) {
        //default ans
        int ans = -1;

        //initializing start and end
        int start = 0;
        int end = nums.length - 1;

        //applying while condition for start & end
        while(start<=end) {
            int mid = start + (end - start)/2;
            if (target > mid) {
                start = mid + 1;
            } else if(target < mid) {
                end = mid -1;
            } else { //if mid = target
                //potential answer found
                ans = mid;

                if (findStartIndex) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        //if index is not found
        return ans;
    }
}
