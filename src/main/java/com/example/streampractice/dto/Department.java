package com.example.streampractice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Department {

    private Long id;
    private String departmentName;
    private Long managerId;
    private Long locationId;

}
