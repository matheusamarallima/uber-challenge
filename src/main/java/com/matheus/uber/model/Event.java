package com.matheus.uber.model;

import com.matheus.uber.dto.EventDTO;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "events")
@Entity
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
    private String title;
    private String description;

    public Event(EventDTO eventDTO) {
        this.date = eventDTO.date();
        this.maxCap = eventDTO.maxCap();
        this.registeredPart = eventDTO.registeredPart();
        this.title = eventDTO.title();
        this.description = eventDTO.description();
    }
}
