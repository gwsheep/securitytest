package com.jproject.securitytest.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    public String parse(String id) {
        return id + " is parsed";
    }
}
