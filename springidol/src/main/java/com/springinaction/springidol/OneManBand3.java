package com.springinaction.springidol;

import java.util.Properties;

/**
 * Created by dujiang on 2016/4/24.
 */
public class OneManBand3 implements Performer {
    @Override
    public void perform() throws PerformanceExecption {
        System.out.println(instruments.getProperty("GUITAR"));
        System.out.println(instruments.getProperty("CYMBAL"));
        System.out.println(instruments.getProperty("HARMONICA"));
    }
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
