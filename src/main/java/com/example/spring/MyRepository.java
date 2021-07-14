package com.example.spring;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public void doQuery() {
        System.out.println("Doing a query");
    }
}
