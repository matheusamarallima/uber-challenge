package com.matheus.uber.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Table(name = "event")
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {

    @Id
    private String id;
    private Integer maxCap;
    private Integer inscriptions;
    private String date;
    private String Title;
    private String description;
}
