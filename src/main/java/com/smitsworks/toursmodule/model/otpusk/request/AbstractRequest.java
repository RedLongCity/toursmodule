package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractRequest {

    private String prefix;
    private String accessToken;
}
