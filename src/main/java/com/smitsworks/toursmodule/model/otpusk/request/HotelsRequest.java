package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelsRequest {

    private int countryId;
    private List<Integer> cityIds;
    private boolean withPrice;

}
