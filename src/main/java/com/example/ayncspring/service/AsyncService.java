package com.example.ayncspring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AsyncService {

    @Async
    public void hello()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(2000);
                log.info("thread slepp ...");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
