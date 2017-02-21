package com.clan.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by weddy on 21.02.17.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MsgNotFoundException extends RuntimeException {

    public MsgNotFoundException(String message)
    {
        super(message);
    }
}
