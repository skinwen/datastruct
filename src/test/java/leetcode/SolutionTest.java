package leetcode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.Assert.*;

/**
 * Created by wentao on 2017/7/22 0022.
 */
public class SolutionTest {
    private static final Logger logger = LoggerFactory.getLogger(SolutionTest.class);
    private Solution solution = new Solution();

    @Test
    public void twoSum() throws Exception {
        int nums[] = new int[]{3, 2, 4};
        int res[] = solution.twoSum(nums, 6);
        logger.info("{}", res);
    }

}