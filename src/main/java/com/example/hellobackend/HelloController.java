package com.example.hellobackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot backend! 2";
    }
}




//    private Helloservice helloservice;
//
//    @GetMapping("/table/{n}")
//    public String table(@PathVariable int n) {
//        return helloservice.printtable(n);
//    }

//    @GetMapping("/hello")
//    public String sayHello(){
//        return "Hello from Spring Boot backend!";
//    }

