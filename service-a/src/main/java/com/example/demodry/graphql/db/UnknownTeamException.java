package com.example.demodry.graphql.db;

@SuppressWarnings("serial")
public class UnknownTeamException extends Exception {

    public UnknownTeamException(String message) {
        super(message);
    }
}