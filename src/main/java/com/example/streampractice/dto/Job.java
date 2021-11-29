package com.example.streampractice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Job {

    private String id;
    private String jobTitle;
    private Long minSalary;
    private Long maxSalary;

}