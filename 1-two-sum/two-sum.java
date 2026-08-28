 class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Loop through the remaining elements
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two elements add up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[0];
    }
}
