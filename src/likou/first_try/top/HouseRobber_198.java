package likou.first_try.top;

/**
 * @author wuping
 * @date 2020-03-20
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，
 * 计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * https://leetcode-cn.com/problems/house-robber/
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 */

public class HouseRobber_198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int idx1 = i - 2;
            int idx2 = i - 3;
            nums[i] = Math.max(idx1 < 0 ? 0 : nums[idx1], idx2 < 0 ? 0 : nums[idx2]) + nums[i];
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}
