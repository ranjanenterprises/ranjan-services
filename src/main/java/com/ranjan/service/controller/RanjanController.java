package com.ranjan.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RanjanController {

    @GetMapping("/myapp/status")
    public String getStatus() {
        return "SUCCESS response from Ranjan services";
    }
}
