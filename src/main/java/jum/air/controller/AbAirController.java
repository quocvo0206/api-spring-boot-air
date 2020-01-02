package jum.air.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbAirController {
    @RequestMapping("/")
    public String index() {
        return "Hello";
    }
}