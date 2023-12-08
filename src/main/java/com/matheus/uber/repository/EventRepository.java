package com.matheus.uber.repository;


import com.matheus.uber.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

    @Query(value = "SELECT * FROM events e WHERE parsedatetime(e.date, 'dd/MM/yyyy') > :currentDate", nativeQuery = true)
    List<Event> findUpcomingEvents(@Param("currentDate") LocalDateTime currentDate);
    /* Aqui estamos buscando eventos que irão acontecer no futuro, em que a data ainda não passou
    Com essa anotação ele checa a data que estamos antes de trazer o evento na lista */

    @NonNull
    Optional<Event> findById(@NonNull String id);
    /* Aqui usamos a geração com UUID, mas como estamos usando essa estrategia
    o JPA pensa q estamos usando uuid(Java Util) mas queremos uma String,
     por isso estamos declarando.
     */

}
