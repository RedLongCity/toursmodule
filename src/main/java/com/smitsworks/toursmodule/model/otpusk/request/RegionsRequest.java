package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegionsRequest extends AbstractRequest {

    @Builder
    public RegionsRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }
}
