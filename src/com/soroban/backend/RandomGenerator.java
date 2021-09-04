package com.soroban.backend;
import java.util.Random;

public class RandomGenerator {

    public static final int UNIT = 9;
    public static final int DOZEN = 99;
    public static final int HUNDRED = 999;
    public static final int THOUSAND = 9999;
    public static final int HUNDRED_THOUSAND = 99999;
    public static final int MILLION = 999999;


    private static final Random r = new Random(System.currentTimeMillis());

    private RandomGenerator() {

    }

    public static int generate(String ord) {

        switch (ord) {
            case "UNIT":
                return r.nextInt(UNIT);
            case "DOZEN":
                return r.nextInt(DOZEN);
            case "HUNDRED":
                return r.nextInt(HUNDRED);
            case "THOUSAND":
                return r.nextInt(THOUSAND);
            case "HUNDRED THOUSAND":
                return r.nextInt(HUNDRED_THOUSAND);
            case "MILLION":
                return r.nextInt(MILLION);
        }
        return -1;
    }

}

