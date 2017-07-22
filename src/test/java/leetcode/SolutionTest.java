package leetcode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Created by wentao on 2017/7/22 0022.
 */
public class SolutionTest {
    @Test
    public void isPowerOfThree() throws Exception {
        boolean res = solution.isPowerOfThree((int) (Math.pow(3,10) + 1.0));
        logger.info("res : {}", res);
    }

    @Test
    public void intersection() throws Exception {
        int num1[] = new int[]{1, 2, 2, 1};
        int num2[] = new int[]{2, 2};
        int res[] = solution.intersection(num1, num2);
        logger.info("res :{}", Arrays.toString(res));
    }

    @Test
    public void singleNumber() throws Exception {
        int arr[] = new int[]{1, 1, 2, 2, 4};
        int res = solution.singleNumber(arr);
        logger.info("{}", res);
    }

    private static final Logger logger = LoggerFactory.getLogger(SolutionTest.class);
    private Solution solution = new Solution();


    @Test
    public void arrayPairSum() throws Exception {
        int arr[] = new int[]{1, 3, 2, 4};
        int res = solution.arrayPairSum(arr);
        logger.info("res :{}", res);
    }


    //[1, 2]
    @Test
    public void twoSum() throws Exception {
        int nums[] = new int[]{3, 2, 4};
        int res[] = solution.twoSum(nums, 6);
        logger.info("{}", res);
    }

    //2
    @Test
    public void hammingDistance() throws Exception {
        int x = 1;
        int y = 4;
        int res = solution.hammingDistance(x, y);
        logger.info("{}", res);
    }

}