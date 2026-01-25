package Bai3.b3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger a = new BigInteger(
                "11111111111111111111111111111111111111111111111111111");
        BigInteger b = new BigInteger(
                "22222222222222222222222222222222222222222222222222222");

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
