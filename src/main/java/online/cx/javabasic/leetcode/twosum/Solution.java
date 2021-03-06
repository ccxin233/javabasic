package online.cx.javabasic.leetcode.twosum;

/**
 * @author 曹鑫 1428604355@qq.com
 * @date 2019/9/28 16:34
 * 167 题
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 345
 * 11
 */
public class Solution {

    public int[] twoSum(int[] arr, int target){
        int l = 0, r = arr.length - 1;
        while (l < r){
            if(arr[l] + arr[r] == target){
                return new int[]{l + 1, r + 1};
            }else if(arr[l] + arr[r] < target){
                l ++;
            }else if(arr[l] + arr[r] > target){
                r --;
            }

        }
        return null;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {1,2,3,4,5};
        int[] res = solution.twoSum(arr, 6);
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
