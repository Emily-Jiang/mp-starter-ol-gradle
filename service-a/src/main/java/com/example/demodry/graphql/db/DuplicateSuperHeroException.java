package com.example.demodry.graphql.db;

@SuppressWarnings("serial")
public class DuplicateSuperHeroException extends Exception {

    public DuplicateSuperHeroException(String message) {
        super(message);
    }
}
