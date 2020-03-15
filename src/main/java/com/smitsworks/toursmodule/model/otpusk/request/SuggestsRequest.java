package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SuggestsRequest extends AbstractRequest {

    private String text;

    public SuggestsRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public SuggestsRequest(String prefix, String accessToken, String text) {
        super(prefix, accessToken);
        this.text = text;
    }
}
