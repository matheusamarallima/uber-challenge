package com.matheus.uber.model;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "event")
@Entity(name = "event")
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Integer maxCap;
    private Integer registeredPart;
    private String date;
    private String Title;
    private String description;
}
