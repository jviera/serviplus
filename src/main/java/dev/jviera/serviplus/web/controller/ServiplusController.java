package dev.jviera.serviplus.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class ServiplusController {

    @GetMapping("/sayhello/{name}")
    public String sayHello(@PathVariable String name)
    {
        return "Hello "+name;
    }
}
