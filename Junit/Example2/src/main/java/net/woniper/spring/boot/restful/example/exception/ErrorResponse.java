package net.woniper.spring.boot.restful.example.exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private int status;
    private int code;
    private String message;
    private String developmentMessage;
    private String moreInfo;
}
