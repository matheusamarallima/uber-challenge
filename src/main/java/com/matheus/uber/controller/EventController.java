package com.matheus.uber.controller;

import com.matheus.uber.dto.EmailDTO;
import com.matheus.uber.dto.EventDTO;
import com.matheus.uber.dto.SubscriptionRequestDTO;
import com.matheus.uber.model.Event;
import com.matheus.uber.model.Subscription;
import com.matheus.uber.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    EventService eventService;


    @GetMapping
    public List<Event> getAll(){
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventDTO eventDTO){
        return eventService.createEvent(eventDTO);
    }

    @GetMapping("/upcoming")
    public List<Event> upcomingEvents(){
        return eventService.upcomingEvents();
    }

    @PostMapping("{eventId}/register")
    public void subscription(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO subscriptionRequestDTO){
        eventService.registerPart(eventId, subscriptionRequestDTO.participantEmail());
    }
}
