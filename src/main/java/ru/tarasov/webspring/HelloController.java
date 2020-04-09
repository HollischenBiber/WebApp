package ru.tarasov.webspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.ref.ReferenceQueue;
import java.util.Map;


@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello-world";
    }

    @PostMapping(value="/answer")
    public String submitForm(@RequestParam Map<String, String> reqParam)
    {
        String name  = reqParam.get("username");

        if (name.equals("username"))
            return "negative";
        else
            return "positive";
    }


}
