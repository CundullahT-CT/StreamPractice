package com.example.streampractice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Location {

    private Long id;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    private String countryId;

}
