package com.springinaction.springidol;

import java.util.Map;

/**
 * Created by dujiang on 2016/4/24.
 */
public class OneManBand2 implements Performer {
    @Override
    public void perform() throws PerformanceExecption {
        for (String key:instruments.keySet()){
            System.out.print(key+": ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Map<String,Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;//以Map类型注入
    }
}




















