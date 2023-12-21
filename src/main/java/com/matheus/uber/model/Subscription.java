package com.matheus.uber.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "subscription")
@Entity(name = "subscription")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Event event;

    private String emailPart;

    public Subscription(Event event, String emailPart) {
        this.event = event;
        this.emailPart = emailPart;
    }
}
