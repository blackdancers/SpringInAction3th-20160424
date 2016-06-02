package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configurationע�����Ϊһ����ʶ��֪Spring������ཫ����һ������Spring Bean�Ķ��塣
 */
@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke(){
        return new Juggler();
    }
}
