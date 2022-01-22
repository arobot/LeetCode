package com.arobotv.problems.p0201_0300.p0326_power_of_three;

public class PowerOfThree {
    public boolean isPowerOfThree(int n){
        return (n > 0 && 1162261467 % n == 0);
    }


    public static void main(String[] args) {
        for(int i= 0;i<10;i++){
            System.out.println("i:"+i+" p:"+Math.pow(3, i));
        }
    }
}
