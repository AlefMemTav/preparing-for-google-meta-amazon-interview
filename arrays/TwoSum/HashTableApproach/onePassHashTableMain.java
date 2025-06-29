class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> hashtable = new HashMap<>();
       int l = nums.length;
       for(int i = 0; i < l; i++) {
        int c = target - nums[i];
        if(hashtable.containsKey(c)) {
         return new int[] { hashtable.get(c), i};
        }
        hashtable.put(nums[i], i);
       }
        return new int[] {};
    }
}
