package com.example.relation;
import com.example.relation.Agenda;
import com.example.relation.Event;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/Event")
@RestController

public class EventResource {
private EventRepository eventRepository;
public EventResource(EventRepository eventRepository) {
this.eventRepository = eventRepository;
}
@GetMapping(value = "/all")
public List<Event> getUsersContact() {
return eventRepository.findAll();
}

@GetMapping(value = "/update")
public List<Event> update() {
Event event = new Event();
Agenda agenda = new Agenda();
agenda.setDescription("one2onemapping");
agenda.setTime("6.30 PM");
agenda.setInstructor("You tube");
event.setDate("23/08/2017");
event.setAgenda(agenda);
eventRepository.save(event);
return eventRepository.findAll();
}

 @DeleteMapping("/{id}")
    public void deleteMethod(@PathVariable int id) {
         eventRepository.delete(id);

}
}
