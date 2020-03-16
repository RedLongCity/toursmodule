package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperatorsRequest {

    private int countryId;
    private int regionId;

}
