package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = map.get(target - nums[i]);
            if (null == temp) {
                map.put(nums[i], i);
            } else {
                res[0] = Math.min(temp, i);
                res[1] = Math.max(temp, i);
                return res;
            }

        }
        return res;
    }

}