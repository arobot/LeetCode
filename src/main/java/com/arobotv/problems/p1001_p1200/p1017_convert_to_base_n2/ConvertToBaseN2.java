package com.arobotv.problems.p1001_p1200.p1017_convert_to_base_n2;

public class ConvertToBaseN2 {

    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了33.17%的用户
     */
    public String baseNeg2(int n) {
        // 负二进制转换
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n & 1);
            n = -(n >> 1);
        }
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }

    /*
     * 输入3，3的二进制为11
     * 1. 11 & 1 = 1，sb = 1
     * 2. 3 >> 1 = 1，n = -1
     * 3. -1 & 1 = 1，sb = 11
     * 4. -1 >> 1 = 0，n = 0
     * 5. sb = 11，sb.reverse() = 11，sb.toString() = 11，return 11
     * 
     * 
     * 输入4，4的二进制为100
     * 1. 100 & 1 = 0，sb = 0
     * 2. 4 >> 1 = 2，n = -2
     * 3. -2 & 1 = 0，sb = 00
     * 4. -2 >> 1 = -1，n = 1
     * 5. 1 & 1 = 1，sb = 001
     * 6. 1 >> 1 = 0，n = 0
     * 7. sb = 001，sb.reverse() = 100，sb.toString() = 100，return 100
     */

}
