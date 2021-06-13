package com.example.ayncspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class Appconfig {

    @Bean("async-thread")
    public Executor asyncThread()
    {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(100);         // 하드웨어 및 환경에서 스레드를 몇개 까지 사용할 수 있는지
        threadPoolTaskExecutor.setCorePoolSize(10);         // 스레드풀을 기본적으로 10개가 사용하는데 다 사용하게 된다면 큐에 들어간다
        threadPoolTaskExecutor.setQueueCapacity(10);        // 큐에도 10개가 다 찬다면 10개가 늘어난다 반복
        threadPoolTaskExecutor.setThreadNamePrefix("Async-");

        return threadPoolTaskExecutor;
    }
}
