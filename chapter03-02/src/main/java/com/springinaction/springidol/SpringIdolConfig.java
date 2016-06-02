package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configurationע�����Ϊһ����ʶ��֪Spring������ཫ����һ������Spring Bean�Ķ��塣
 */
@Configuration
public class SpringIdolConfig {
    @Bean
    public Poem sonnet29(){
        return new Sonnet29();
    }
    @Bean
    public Performer poeticDuke(){
        return new PoeticJuggler(sonnet29());
    }

    @Bean
    public Performer kenny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle bells");
        return kenny;
    }

    @Bean
    public Performer duke(){
        return new Juggler();
    }
    @Bean
    public Performer duke15(){
        return new Juggler(15);
    }
}
