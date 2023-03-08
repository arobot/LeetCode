package com.arobotv.problems.p1301_p1400.p1301_number_of_paths_with_max_score;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfPathsWithMaxScoreTest {
    @Test
    void testPathsWithMaxScore() {
        NumberOfPathsWithMaxScore s =new NumberOfPathsWithMaxScore();
        List<String> board = new ArrayList<>();
        board.add("E23");
        board.add("2X2");
        board.add("12S");
       int[] data = s.pathsWithMaxScore(board);
       Assertions.assertEquals(7, data[0]);
       Assertions.assertEquals(1, data[1]);
    }
    @Test
    void testPathsWithMaxScore2() {
        NumberOfPathsWithMaxScore s =new NumberOfPathsWithMaxScore();
        List<String> board = new ArrayList<>();
        board.add("E12");
        board.add("1X1");
        board.add("21S");
       int[] data = s.pathsWithMaxScore(board);
       Assertions.assertEquals(4, data[0]);
       Assertions.assertEquals(2, data[1]);
    }
    @Test
    void testPathsWithMaxScore3() {
        NumberOfPathsWithMaxScore s =new NumberOfPathsWithMaxScore();
        List<String> board = new ArrayList<>();
        board.add("E11");
        board.add("XXX");
        board.add("11S");
       int[] data = s.pathsWithMaxScore(board);
       Assertions.assertEquals(0, data[0]);
       Assertions.assertEquals(0, data[1]);
    }
}
