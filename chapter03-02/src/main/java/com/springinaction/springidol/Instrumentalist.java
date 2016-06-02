package com.springinaction.springidol;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 乐器演奏家
 * Created by dujiang on 2016/4/23.
 */
@Component("eddie")
public class Instrumentalist implements Performer {

    public Instrumentalist() {

    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Value("Eruption")
    private String song;
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
    //@Autowired(required = false)
    //@Qualifier("guitar")
//    @Autowired
//    @Strummed
//    @StringedInstrument
    @Inject
    @Named("guitar")
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


















