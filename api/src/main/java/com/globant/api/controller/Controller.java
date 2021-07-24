package com.globant.api.controller;

import com.globant.api.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements IController{

    @Autowired
    IService service;

    @Override
    public String get() {
        return service.getMessage();
    }
}
