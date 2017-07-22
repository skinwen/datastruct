package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
public class Sort {
    public static void sort(int[] arr, int left, int right) {
        if (right >= left) {
            int provide = partition(arr, left, right);
            sort(arr, left, provide - 1);
            sort(arr, provide + 1, right);
        }
    }

    //哨兵法
    private static int partition(int[] arr, int left, int right) {

        int provide = arr[left];
        int x = left;
        int y = right;
        while (x < y) {
            while (x < y) {
                if (arr[y] < provide) {
                    arr[x++] = arr[y];
                    break;
                }
                y--;
            }
            while (x < y) {
                if (arr[x] > provide) {
                    arr[y--] = arr[x];
                    break;
                }
                x++;
            }
        }
        arr[x] = provide;
        return x;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        long begin = System.currentTimeMillis();
//        sort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
//        System.out.println(Arrays.toString(arr));
    }
}
