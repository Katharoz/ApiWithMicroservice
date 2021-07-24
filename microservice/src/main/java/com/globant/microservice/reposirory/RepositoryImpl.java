package com.globant.microservice.reposirory;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryImpl implements IRepository{

    @Override
    public String giveMessage() {
        return "Hola mondo!";
    }
}
