package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration注解会作为一个标识告知Spring：这个类将包含一个或多个Spring Bean的定义。
 */
@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke(){
        return new Juggler();
    }
}
