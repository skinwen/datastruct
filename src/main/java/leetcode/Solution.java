package leetcode;

import java.util.*;

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
                res[0] = i > temp ? temp : i;
                res[1] = i > temp ? i : temp;
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

    //quick sort
    public int arrayPairSum(int[] nums) {
        Sort.sort(nums, 0, nums.length - 1);
//        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            res += nums[i];
        }
        return res;
    }

    //异或
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> integerList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (integers.contains(nums2[i])) {
                continue;
            }
            if (set.contains(nums2[i])) {
                integerList.add(nums2[i]);
            }
            integers.add(nums2[i]);

        }
        int res[] = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            res[i] = integerList.get(i);
        }
        return res;
    }

    public boolean isPowerOfThree(int n) {
        if (n == 3 || n == 1) {
            return true;
        }

        if (n == 2 || n == 0) {
            return false;
        }

        if (n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }

    //二分查找
    public int firstBadVersion(int n) {
        int x = 0;
        int y = n;
        while (x < y) {
            int mid = (y - x) / 2 + x;
            if (isBadVersion(mid)) {
                y = mid;
            } else {
                x = mid + 1;
            }
        }
        return x;
    }

    private boolean isBadVersion(int version) {
        return false;
    }
}
