package com.soroban;
import java.util.Random;

public class RandomGenerator {

    public static final int UNIT = 9;
    public static final int TEN = 99;
    public static final int HUNDRED = 999;
    public static final int THOUSAND = 9999;
    public static final int MILLION = 99999;

    private static final Random r = new Random(System.currentTimeMillis());

    public static int generateUnits() {
        return r.nextInt(UNIT);
    }

    public static int generateTens() {
        return r.nextInt(TEN);
    }

    public static int generateHundreds() {
        return r.nextInt(HUNDRED);
    }

    public static int generateThousands() {
        return r.nextInt(THOUSAND);
    }

    public static int generateMillion() {
        return r.nextInt(MILLION);
    }

}

