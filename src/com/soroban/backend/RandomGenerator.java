package com.soroban;
import java.util.Random;

public class RandomGenerator {

    public static final int UNIT = 9;
    public static final int TEN = 99;
    public static final int HUNDRED = 999;
    public static final int THOUSAND = 9999;
    public static final int MILLION = 99999;

    private static final Random r = new Random(System.currentTimeMillis());

    public static int[] generate(String ord) {
        int num[] = new int[2];

        switch (ord) {
            case "UNIT":
                num[0] = r.nextInt(UNIT);
                num[1] = r.nextInt(UNIT);
                break;

            case "TEN":
                num[0] = r.nextInt(TEN);
                num[1] = r.nextInt(TEN);
                break;

            case "HUNDRED":
                num[0] = r.nextInt(HUNDRED);
                num[1] = r.nextInt(HUNDRED);
                break;

            case "THOUSAND":
                num[0] = r.nextInt(THOUSAND);
                num[1] = r.nextInt(THOUSAND);
                break;

            case "MILLION":
                num[0] = r.nextInt(MILLION);
                num[1] = r.nextInt(MILLION);
                break;
        }
        return num;
    }
}

