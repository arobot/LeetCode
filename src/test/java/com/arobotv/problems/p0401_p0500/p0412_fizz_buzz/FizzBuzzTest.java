package com.arobotv.problems.p0401_p0500.p0412_fizz_buzz;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz(3);
        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals("1", list.get(0));
        Assertions.assertEquals("2", list.get(1));
        Assertions.assertEquals("Fizz", list.get(2));
    }

    @Test
    void testFizzBuzz2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz(6);
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals("1", list.get(0));
        Assertions.assertEquals("2", list.get(1));
        Assertions.assertEquals("Fizz", list.get(2));
        Assertions.assertEquals("4", list.get(3));
        Assertions.assertEquals("Buzz", list.get(4));
        Assertions.assertEquals("Fizz", list.get(5));
    }

    @Test
    void testFizzBuzz3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz(16);
        Assertions.assertEquals(16, list.size());
        Assertions.assertEquals("1", list.get(0));
        Assertions.assertEquals("2", list.get(1));
        Assertions.assertEquals("Fizz", list.get(2));
        Assertions.assertEquals("4", list.get(3));
        Assertions.assertEquals("Buzz", list.get(4));
        Assertions.assertEquals("Fizz", list.get(5));
        Assertions.assertEquals("FizzBuzz", list.get(14));
        Assertions.assertEquals("16", list.get(15));
    }

    @Test
    void testFizzBuzz4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz2(3);
        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals("1", list.get(0));
        Assertions.assertEquals("2", list.get(1));
        Assertions.assertEquals("Fizz", list.get(2));
    }

    @Test
    void testFizzBuzz5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz2(6);
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals("1", list.get(0));
        Assertions.assertEquals("2", list.get(1));
        Assertions.assertEquals("Fizz", list.get(2));
        Assertions.assertEquals("4", list.get(3));
        Assertions.assertEquals("Buzz", list.get(4));
        Assertions.assertEquals("Fizz", list.get(5));
    }

    @Test
    void testFizzBuzz6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz2(16);
        Assertions.assertEquals(16, list.size());
        Assertions.assertEquals("1", list.get(0));
        Assertions.assertEquals("2", list.get(1));
        Assertions.assertEquals("Fizz", list.get(2));
        Assertions.assertEquals("4", list.get(3));
        Assertions.assertEquals("Buzz", list.get(4));
        Assertions.assertEquals("Fizz", list.get(5));
        Assertions.assertEquals("FizzBuzz", list.get(14));
        Assertions.assertEquals("16", list.get(15));
    }
}
