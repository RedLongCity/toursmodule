package com.smitsworks.toursmodule.model.otpusk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class HotelsRequest {

    @Id
    @EqualsAndHashCode.Exclude
    private Integer id;

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LocalDateTime expired;

    private int countryId;
    private List<Integer> cityIds;
    private boolean withPrice;

}
