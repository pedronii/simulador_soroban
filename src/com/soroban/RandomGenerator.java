package com.soroban;
import java.util.Random;

public class RandomGenerator {

    private int max;
    private int min;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int generateUnits() {
        Random r = new Random();
        return r.nextInt(9);
    }

}

