package com.springinaction.springidol;

/**
 * 钢琴
 * Created by dujiang on 2016/4/24.
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.print("PLINK PLINK PLINK PLINK ...");
    }
    public Piano() {
    }
}
