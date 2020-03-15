package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DatesRequest extends AbstractRequest {

    private int to;
    private int regionId;

    public DatesRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public DatesRequest(String prefix, String accessToken, int to, int regionId) {
        super(prefix, accessToken);
        this.to = to;
        this.regionId = regionId;
    }
}
