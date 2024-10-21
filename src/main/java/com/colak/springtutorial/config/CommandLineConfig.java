package com.colak.springtutorial.config;

import com.colak.springtutorial.service.HikariDataSourcePoolDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class CommandLineConfig {

    @Bean
    CommandLineRunner commandLineRunner(HikariDataSourcePoolDetail hikariDataSourcePoolDetail) {
        return _ -> {
            log.info("Active : {}", hikariDataSourcePoolDetail.getActive());
            log.info("Idle : {}", hikariDataSourcePoolDetail.getIdle());
        };
    }
}
