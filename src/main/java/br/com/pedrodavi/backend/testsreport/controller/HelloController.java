package br.com.pedrodavi.backend.testsreport.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello!");
    }

}
