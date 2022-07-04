package com.example.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CheckParameterException extends RuntimeException {

    public CheckParameterException() {
        super("<b>Проверьте наличие параметров!</b>");
    }


}
