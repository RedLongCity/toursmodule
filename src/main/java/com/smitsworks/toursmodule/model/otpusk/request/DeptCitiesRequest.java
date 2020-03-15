package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeptCitiesRequest extends AbstractRequest {

    private int geoId;

    public DeptCitiesRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public DeptCitiesRequest(String prefix, String accessToken, int geoId) {
        super(prefix, accessToken);
        this.geoId = geoId;
    }
}
