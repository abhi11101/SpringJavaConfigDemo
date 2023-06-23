package org.abhi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.abhi") //No need for component scan if we are creating beans manually llike below
@PropertySource("classpath:sports.properties")
public class ConfigFile {

    @Bean
    public Fortune happyFortune(){
        return new HappyFortune();
    }

    @Bean
    public Coach baseballCoachBeanCreate(){
       return new BaseballCoach(happyFortune());
    }
}
