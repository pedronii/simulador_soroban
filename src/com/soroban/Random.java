package com.soroban;

public class Random {

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

    public int generate(int min, int max) {
        int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return rand;
    }

}