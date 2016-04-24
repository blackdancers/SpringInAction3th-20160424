package com.springinaction.springidol;


/**
 * 乐器演奏家
 * Created by dujiang on 2016/4/23.
 */
public class Instrumentalist implements Performer{
    public Instrumentalist() {
    }
    @Override
    public void perform() throws PerformanceExecption {
        System.out.println("playing "+song+":");
        instrument.play();
    }
    private int age;//年龄
    private String song;//歌曲
    private Instrument instrument;//乐器

    public void setSong(String song) {//注入歌曲
        this.song = song;
    }

    public void setAge(int age) {//注入年龄
        this.age = age;
    }

    public void setInstrument(com.springinaction.springidol.Instrument instrument) {//注入乐器
        this.instrument = instrument;
    }
}


















