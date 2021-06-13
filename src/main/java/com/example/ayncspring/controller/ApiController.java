package com.example.ayncspring.controller;


import com.example.ayncspring.service.AsyncService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final AsyncService asyncService;


    @GetMapping("/hello")
    public String hello()
    {
        asyncService.hello();
        return "hello";
    }
}
