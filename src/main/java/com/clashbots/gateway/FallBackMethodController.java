package com.clashbots.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User Service is taking longer than expected." +
                " Please try again later.";
    }

    @GetMapping("/contractServiceFallBack")
    public String contractServiceFallBackMethod(){
        return "Contract Service is taking longer than expected." +
                " Please try again later.";
    }
}
