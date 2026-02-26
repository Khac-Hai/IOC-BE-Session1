package session16.bai2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
        System.out.println("=> Event added successfully!");
    }

    public void displayEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            events.forEach(System.out::println);
        }
    }

    public void checkEventStatus(Event event) {
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(event.getStartDate())) {
            System.out.println("Event \"" + event.getName() + "\" is upcoming.");
        } else if (now.isAfter(event.getEndDate())) {
            System.out.println("Event \"" + event.getName() + "\" has already passed.");
        } else {
            System.out.println("Event \"" + event.getName() + "\" is ongoing.");
        }
    }
}
