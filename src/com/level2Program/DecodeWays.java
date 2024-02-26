package com.level2Program;

import java.util.*;
public class DecodeWays
{
    public int numDecodings(String s) 
    {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') 
        {
            return 0;
        }

        int[] output = new int[n + 1];
        output[0] = 1;
        output[1] = 1;

        for (int i = 2; i <= n; i++) {
            int ones = Integer.parseInt(s.substring(i - 1, i));
            int tens = Integer.parseInt(s.substring(i - 2, i));

            if (ones >= 1 && ones <= 9) {
                output[i] += output[i - 1];
            }

            if (tens >= 10 && tens <= 26) {
                output[i] += output[i - 2];
            }
        }
        System.out.println(Arrays.toString(output));

        return output[n];
    }

    public static void main(String[] args) {
        DecodeWays solution = new DecodeWays();

        // Test cases
        System.out.println(solution.numDecodings("12")); // Output: 2
        System.out.println(solution.numDecodings("226")); // Output: 3
        System.out.println(solution.numDecodings("06"));  // Output: 0
    }
}

