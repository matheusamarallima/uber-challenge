package com.matheus.uber.service;

import com.matheus.uber.dto.EventDTO;
import com.matheus.uber.model.Event;
import com.matheus.uber.model.Subscription;
import com.matheus.uber.repository.EventRepository;
import com.matheus.uber.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @Autowired
    private EmailServiceClient emailServiceClient;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Subscription> getAllSubs() {
        return subscriptionRepository.findAll();
    }

    public List<Event> upcomingEvents() {
        return eventRepository.findUpcomingEvents(LocalDateTime.now());
    }

    public Event createEvent(EventDTO eventDTO){
        Event event = new Event(eventDTO);
        return eventRepository.save(event);
    }
}
