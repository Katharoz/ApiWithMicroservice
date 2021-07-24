package com.globant.microservice.service;

import com.globant.microservice.reposirory.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService{

    @Autowired
    IRepository repository;

    @Override
    public String getMessage() {
        return repository.giveMessage();
    }
}
