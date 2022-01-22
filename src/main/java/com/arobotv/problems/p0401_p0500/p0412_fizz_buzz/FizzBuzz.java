package com.arobotv.problems.p0401_p0500.p0412_fizz_buzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        int i = 1;
        List<String> list = new ArrayList<>();
        while (i <= n) {
            String tmp = "";
            if (i % 3 == 0)
                tmp = "Fizz";
            if (i % 5 == 0)
                tmp += "Buzz";
            if (tmp == "")
                tmp = String.valueOf(i);
            list.add(tmp);
            i++;
        }
        return list;
    }

    public List<String> fizzBuzz2(int n) {

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(i + 1);
        }
        for (int i = 3; i <= n; i += 3) {
            s[i - 1] = "Fizz";
        }

        for (int i = 5; i <= n; i += 5) {
            if (s[i - 1] == "Fizz")
                s[i - 1] = "FizzBuzz";
            else
                s[i - 1] = "Buzz";
        }
        return Arrays.asList(s);
    }
}
