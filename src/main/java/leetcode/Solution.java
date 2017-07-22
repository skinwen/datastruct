package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wentao on 2017/7/22 0022.
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

    public int hammingDistance(int x, int y) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int xd = x & 1;
            int yd = y & 1;
            if (xd != yd) {
                res++;
            }
            x = x >>> 1;
            y = y >>> 1;
        }
        return res;
    }

}
