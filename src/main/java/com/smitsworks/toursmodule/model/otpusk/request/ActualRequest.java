package com.smitsworks.toursmodule.model.otpusk.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActualRequest {

    private int offerId;
    private String people;

}
