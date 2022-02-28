package com.arobotv.problems.p0001_0100.p0055_jump_game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {
    static JumpGame jumpGame = new JumpGame();

    @Test
    void testCanJump() {
        Assertions.assertTrue(jumpGame.canJump(new int[] { 2, 3, 1, 1, 4 }));
    }

    @Test
    void testCanJump2() {
        Assertions.assertFalse(jumpGame.canJump(new int[] { 3, 2, 1, 0, 4 }));
    }

    @Test
    void testCanJump3() {
        Assertions.assertTrue(jumpGame.canJump(new int[] { 0 }));
    }

    @Test
    void testCanJump4() {
        Assertions.assertTrue(jumpGame.canJump(new int[] { 3, 2, 1, 0 }));
    }
    @Test
    void testCanJump5() {
        Assertions.assertTrue(jumpGame.canJump2(new int[] { 2, 3, 1, 1, 4 }));
    }

    @Test
    void testCanJump6() {
        Assertions.assertFalse(jumpGame.canJump2(new int[] { 3, 2, 1, 0, 4 }));
    }

    @Test
    void testCanJump7() {
        Assertions.assertTrue(jumpGame.canJump2(new int[] { 0 }));
    }

    @Test
    void testCanJump8() {
        Assertions.assertTrue(jumpGame.canJump2(new int[] { 3, 2, 1, 0 }));
    }
}
