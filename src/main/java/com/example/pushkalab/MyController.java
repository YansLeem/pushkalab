package com.example.pushkalab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {

    @RequestMapping(value = "/pushka")
    public String pushka(@RequestParam(name = "name", required = false, defaultValue = "Army") String name,
                         Map<String, Object> model) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/")
    public String main (Map<String, Object > model){
        return "Hello, Army!";
    }

}