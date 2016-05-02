package com.springinaction.springidol;

/**
 * Created by dujiang on 2016/4/22.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {//<——注入Poem
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {//<——注入豆子袋数量和Poem
        super(beanBags);
        this.poem = poem;
    }
    public void perform() throws PerformanceExecption {
        super.perform();
        System.out.println("while recting...");
        poem.recite();
    }
}
