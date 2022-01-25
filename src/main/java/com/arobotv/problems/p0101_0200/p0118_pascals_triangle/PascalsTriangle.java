package com.arobotv.problems.p0101_0200.p0118_pascals_triangle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        while (numRows > 1) {
            List<Integer> last = result.get(result.size() - 1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int i = 1; i < last.size(); i++) {
                current.add(last.get(i - 1) + last.get(i));
            }
            current.add(1);
            result.add(current);
            numRows--;
        }
        return result;
    }
}
