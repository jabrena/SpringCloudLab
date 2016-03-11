package net.woniper.spring.boot.restful.example.exception.support;

import lombok.Getter;

public class DuplicationUsernameException extends RuntimeException {

    @Getter
    private String username;

    public DuplicationUsernameException(String username) {
        this.username = username;
    }

}
