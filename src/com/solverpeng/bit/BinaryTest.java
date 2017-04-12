package com.solverpeng.bit;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/7 0007
 *      desc  :
 * </pre>
 */
public class BinaryTest {
    public static void main(String[] args) {
        BinaryTest binaryTest = new BinaryTest();
        int countOne = binaryTest.countOne(10);

        boolean powerOfFour = binaryTest.isPowerOfFour(64);

        int sum = binaryTest.getSum(10, 20);

        int missingNumber = binaryTest.missingNumber(new int[]{0, 1, 2, 4, 5, 6});

        int l = binaryTest.largest_power(100);

        int i = binaryTest.reverseBits(10);
        System.out.println(i);

    }

    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++, n >>= 1){
            res = res << 1 | (n & 1);
        }
        return res;
    }

    public int largest_power(int N) {
        //changing all right side bits to 1.
        N = N | (N >> 1);
        N = N | (N >> 2);
        N = N | (N >> 4);
        N = N | (N >> 8);
        N = N | (N >> 16);
        return (N + 1) >> 1;
    }

    public int missingNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; ++i) {
            ret ^= i;
            ret ^= nums[i];
        }
        return ret ^= nums.length;
    }

    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1); //be careful about the terminating condition;
    }

    public int countOne(int num) {
        int count = 0;
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }

    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;
        //(num & (num-1)) == 0这个条件有可能是2的幂产生的。
        //(num & 0x55555555) != 0这个条件为的是铲除2的幂
        if ((num & (num - 1)) == 0 && (num & 0x55555555) != 0)
            return true;

        return false;
    }

}
