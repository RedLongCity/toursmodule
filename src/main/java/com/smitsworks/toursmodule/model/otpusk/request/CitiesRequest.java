package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CitiesRequest {

    private int countryId;
    private boolean withPrice;

}
