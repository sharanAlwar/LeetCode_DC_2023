//1470
class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] first = new int[n];
        int[] last  = new int[n];
        for(int i=0;i<n;i++){
            first[i]=nums[i];
            last[i] =nums[n+i];
        }
        int j = 0;
        int f = 0;
        for(int i=0;i<nums.length;i=i+2){
            nums[i]=first[f];
            f++;
        }
        int l = 0;
        for(int i=1;i<nums.length;i=i+2){
            nums[i]=last[l];
            l++;
        }
        return nums;
    }
}
