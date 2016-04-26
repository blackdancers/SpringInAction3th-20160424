package com.springinaction.springidol;


/**
 * 萨克斯管
 * Created by dujiang on 2016/4/24.
 */
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT ....");
    }
    public Saxophone() {
    }
}
