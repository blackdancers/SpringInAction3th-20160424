package com.springinaction.springidol;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * 乐器演奏家
 * Created by dujiang on 2016/4/23.
 */
public class Instrumentalist implements Performer {

    public Instrumentalist() {

    }

    /**
     * 构造方法
     * @param instrument
     */
    @Autowired
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceExecption {
        instrument.play();
    }

    /**
     * 属性
     */
    @Autowired(required = false)
    private Instrument instrument;//乐器

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    /**
     * 任意方法
     * @param instrument
     */
    @Autowired
    public void heresYourInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}


















