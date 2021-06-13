package com.example.ayncspring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class AsyncService {


    // CompleteableFutrue   : api가 동시에 여러개 나와서 조인시키는것. 결과를 모아서 리턴할때 사용함.
    // Async                : Aop 기반이기 때문에 procy를 지나옴 퍼블릭 메서드에서만 사용가능함. 같은 클래스 에서 같은 메소드를 그냥 호출한다면 async를 진행하지 않음
    @Async("async-thread")
    public CompletableFuture run()
    {
        return new AsyncResult(hello()).completable();
    }
    public String hello()
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

        return "async hello";
    }
}
