package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * 吉他
 * Created by dujiang on 2016/4/24.
 */

@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.print("guitar guitar guitar guitar ....");
    }
}
