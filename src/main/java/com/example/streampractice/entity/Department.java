package com.example.streampractice.entity;

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
