package com.smitsworks.toursmodule.model.otpusk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class DatesRequest {

    @Id
    @EqualsAndHashCode.Exclude
    private Integer id;

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LocalDateTime expired;

    private int to;
    private int regionId;

}
