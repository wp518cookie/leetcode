package likou.card.top_interview_questions_medium.sort_and_search;

/**
 * @author wuping
 * @date 2020-08-31
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvyz1t/
 * <p>
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * <p>
 * 你可以假设数组中不存在重复的元素。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * 示例 2:
 * <p>
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 */

public class Search {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 2};
        System.out.println(new Search().search(nums, 0));
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            int compareResult = nums[mid] - target;
            if (compareResult > 0) {
                if (nums[l] <= nums[mid]) {
                    if (nums[l] <= target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    r = mid - 1;
                }
            } else if (compareResult < 0) {
                if (nums[l] <= nums[mid]) {
                    l = mid + 1;
                } else {
                    if (nums[l] > target) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            } else {
                return mid;
            }
        }
        return nums[l] == target ? l : -1;
    }
}
