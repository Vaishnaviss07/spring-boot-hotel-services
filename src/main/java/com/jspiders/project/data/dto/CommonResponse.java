package com.jspiders.project.data.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class CommonResponse {
    private String message;
    private HttpStatus httpStatus;
    private  int statusCode;
    private boolean success;
    private  Object data;
}
