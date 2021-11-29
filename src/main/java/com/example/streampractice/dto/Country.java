package com.example.streampractice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Country {

    private String id;
    private String countryName;
    private Long regionId;

}