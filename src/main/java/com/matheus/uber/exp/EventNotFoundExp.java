package com.matheus.uber.exp;

public class EventNotFoundExp extends RuntimeException {
    public EventNotFoundExp(){
        super("Evento não foi encontrado");
    }

}
