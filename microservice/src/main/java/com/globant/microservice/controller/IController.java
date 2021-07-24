package com.globant.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface IController {

    @GetMapping(value = "/getMessage")
    String get();

}
