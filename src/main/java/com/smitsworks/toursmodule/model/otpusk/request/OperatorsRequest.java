package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OperatorsRequest extends AbstractRequest {

    private int countryId;
    private int regionId;

    public OperatorsRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public OperatorsRequest(String prefix, String accessToken, int countryId, int regionId) {
        super(prefix, accessToken);
        this.countryId = countryId;
        this.regionId = regionId;
    }
}
