package com.springinaction.springidol;

/**
 * 单例类
 * Created by dujiang on 2016/4/22.
 */
public class Stage {
    private Stage() {
    }
    private static class StageSingletonHolder{
        static Stage instance = new Stage();//延迟加载实例
    }
    public static Stage getInstance(){
        return StageSingletonHolder.instance;//返回实例
    }
}

















