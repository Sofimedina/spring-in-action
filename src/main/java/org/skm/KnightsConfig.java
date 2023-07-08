package org.skm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightsConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest(),minstrel());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel(){
        return new Minstrel(System.out);
    }
}
