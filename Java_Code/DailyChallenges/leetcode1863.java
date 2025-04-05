package DailyChallenges;
public class leetcode1863 {
    int result = 0;

    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0); // start from index 0, current XOR = 0
        return result;
    }

    // Recursive DFS function to explore all subsets
    private void dfs(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            // Base case: all elements processed
            result += currentXor;
            return;
        }

        // Include current element in subset
        dfs(nums, index + 1, currentXor ^ nums[index]);

        // Exclude current element from subset
        dfs(nums, index + 1, currentXor);
    }
}

