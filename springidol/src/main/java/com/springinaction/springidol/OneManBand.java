package com.springinaction.springidol;

import java.util.Collection;

/**
 * 一人乐队的参赛者
 * Created by dujiang on 2016/4/24.
 */
public class OneManBand implements Performer {
    @Override
    public void perform() throws PerformanceExecption {
        for (Instrument instrument:instruments){
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;

    /**
     * 注入Instrument集合
     * @param instruments
     */
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
