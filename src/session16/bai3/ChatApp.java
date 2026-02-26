package session16.bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChatApp {
    private List<Message> messages = new ArrayList<>();

    public void sendMessage(String sender, String content) {
        Message msg = new Message(sender, content, java.time.LocalDateTime.now());
        messages.add(msg);
        System.out.println("=> Message sent successfully!");
    }

    public void showHistory() {
        if (messages.isEmpty()) {
            System.out.println("No messages yet.");
        } else {
            messages.forEach(System.out::println);
        }
    }

    public void filterBySender(String sender) {
        List<Message> filtered = messages.stream()
                .filter(m -> m.getSender().equalsIgnoreCase(sender))
                .collect(Collectors.toList());
        if (filtered.isEmpty()) {
            System.out.println("No messages from " + sender);
        } else {
            filtered.forEach(System.out::println);
        }
    }

    public void filterByDate(String dateInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(dateInput, formatter);
            List<Message> filtered = messages.stream()
                    .filter(m -> m.getTimestamp().toLocalDate().equals(date))
                    .collect(Collectors.toList());
            if (filtered.isEmpty()) {
                System.out.println("No messages on " + dateInput);
            } else {
                filtered.forEach(System.out::println);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }
}
