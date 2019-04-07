package io.team21.calendarservice.repositories;

import io.team21.calendarservice.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
