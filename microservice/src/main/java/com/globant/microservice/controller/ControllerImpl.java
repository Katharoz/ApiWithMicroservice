package com.globant.microservice.controller;

import com.globant.microservice.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerImpl implements IController{

    @Autowired
    IService service;

    @Override
    public String get() {
        return service.getMessage();
    }
}
