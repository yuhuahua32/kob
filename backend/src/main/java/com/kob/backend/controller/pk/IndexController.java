package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("Index/")
    public String func(){
        return "hhhhh";
    }


}
