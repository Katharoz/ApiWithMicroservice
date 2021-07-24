package com.globant.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface IController {

    @GetMapping("/getMessage")
    String get();

}
