class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> hashtable = new HashMap<>();
       int l = nums.length;
       for(int i = 0; i < l; i++) {
        hashtable.put(nums[i], i);
       }
       for(int i = 0; i < l; i++) {
        int c = target - nums[i];
        if(hashtable.containsKey(c) && hashtable.get(c) != i) {
         return new int[] { i, hashtable.get(c) };
        }
       }
        return new int[] {};
    }
}
