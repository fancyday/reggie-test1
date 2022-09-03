package com.itheima.common;

import org.springframework.remoting.RemoteTimeoutException;

public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
