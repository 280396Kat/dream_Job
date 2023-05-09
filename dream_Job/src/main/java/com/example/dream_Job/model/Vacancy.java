package com.example.dream_Job.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vacancy {
    @EqualsAndHashCode.Include
    private int id;

    private String title;

    private String description;

    private LocalDate date;
}
