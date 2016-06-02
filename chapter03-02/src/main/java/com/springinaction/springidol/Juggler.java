package com.springinaction.springidol;

/**
 * 杂技师
 * Created by dujiang on 2016/4/21.
 */
public class Juggler implements Performer{
    //默认同时抛3个袋子,游戏用的装了豆子的小袋
    private int beanBags = 3;
    public Juggler(){
    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    @Override
    public void perform() throws PerformanceExecption {
        System.out.println("JUGGLER "+beanBags+" BEANBAGS");
    }
}
