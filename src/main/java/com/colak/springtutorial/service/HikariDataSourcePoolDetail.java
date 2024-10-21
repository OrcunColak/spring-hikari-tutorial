package com.colak.springtutorial.service;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariPool;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.DirectFieldAccessor;
import org.springframework.stereotype.Service;

// See https://blog.devgenius.io/database-connection-pool-monitoring-strategies-for-spring-boot-e85183a9028b
@Service
@RequiredArgsConstructor
public class HikariDataSourcePoolDetail {

    private final HikariDataSource dataSource;

    public HikariPool getHikariPool() {
        return (HikariPool) new DirectFieldAccessor(dataSource).getPropertyValue("pool");
    }

    public int getActive() {
        try {
            return getHikariPool().getActiveConnections();
        } catch (Exception ex) {
            return -1;
        }
    }

    public int getWaiting() {
        try {
            return getHikariPool().getThreadsAwaitingConnection();
        } catch (Exception ex) {
            return -1;
        }
    }

    public int getIdle() {
        try {
            return getHikariPool().getIdleConnections();
        } catch (Exception ex) {
            return -1;
        }
    }

    public int getMax() {
        return dataSource.getMaximumPoolSize();
    }
}
