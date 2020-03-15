package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CountriesRequest extends AbstractRequest {

    private boolean withPrice;

    public CountriesRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public CountriesRequest(String prefix, String accessToken, boolean withPrice) {
        super(prefix, accessToken);
        this.withPrice = withPrice;
    }
}
