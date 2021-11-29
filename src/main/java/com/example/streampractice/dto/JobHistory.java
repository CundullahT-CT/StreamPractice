package com.example.streampractice.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JobHistory {

    private Long employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String jobId;
    private Long departmentId;

}
