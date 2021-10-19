package com.community.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class CommunityResponseBody extends Exception{
    private static final long serialVersionUid=1l;
    public CommunityResponseBody(String message){
        super(message);
    }
}
