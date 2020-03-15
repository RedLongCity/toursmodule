package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CitiesRequest extends AbstractRequest {

    private int countryId;
    private boolean withPrice;

    public CitiesRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public CitiesRequest(String prefix, String accessToken, int countryId, boolean withPrice) {
        super(prefix, accessToken);
        this.countryId = countryId;
        this.withPrice = withPrice;
    }
}
