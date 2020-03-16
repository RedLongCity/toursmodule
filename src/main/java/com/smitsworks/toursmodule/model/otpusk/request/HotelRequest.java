package com.smitsworks.toursmodule.model.otpusk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class HotelRequest {

    @Id
    @EqualsAndHashCode.Exclude
    private Integer id;

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LocalDateTime expired;

    private int hotelId;

}
