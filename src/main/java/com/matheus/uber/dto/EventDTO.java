package com.matheus.uber.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record EventDTO(int maxCap, int registeredPart, String date, String title, String description) {
}
