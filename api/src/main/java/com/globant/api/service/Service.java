package com.globant.api.service;

import com.globant.api.client.IClient;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service implements IService{

    @Autowired
    IClient client;

    @Override
    public String getMessage() {
        return client.get();
    }
}
