package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class HotelsRequest extends AbstractRequest {

    private int countryId;
    private List<Integer> cityIds;
    private boolean withPrice;

    public HotelsRequest(String prefix, String accessToken) {
        super(prefix, accessToken);
    }

    @Builder
    public HotelsRequest(String prefix, String accessToken, int countryId, List<Integer> cityIds, boolean withPrice) {
        super(prefix, accessToken);
        this.countryId = countryId;
        this.cityIds = cityIds;
        this.withPrice = withPrice;
    }
}
