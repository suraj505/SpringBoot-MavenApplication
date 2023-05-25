package com.staragile.mvc.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockersController {
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}