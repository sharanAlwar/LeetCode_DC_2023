//35
class Solution {
    public static int searchInsert(int[] nums, int target) {
		if(nums[0]>=target) {
			return 0;
		}else if(nums[nums.length-1]<target) {
			return nums.length;
		}
		for (int i = 0; i < nums.length-1; i++) {
			if((nums[i]<=target) && (target<=nums[i+1])) {
				return i+1;
			}
		}
		return 1;
    }
}
