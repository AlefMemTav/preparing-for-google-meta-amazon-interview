class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            int a = nums[i];
            for(int j = i + 1; j < l; j++) {
                int b = nums[j];
                if(a + b == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
