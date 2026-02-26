package session16.bai2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventManager manager = new EventManager();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        while (true) {
            System.out.print("Nhập tên sự kiện (hoặc 'exit' để thoát): ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Danh sách sự kiện:");
                manager.displayEvents();
                break;
            }

            if (name.isEmpty()) {
                System.out.println("Can not enter empty string");
                continue;
            }

            LocalDateTime startDate = null;
            LocalDateTime endDate = null;

            while (true) {
                try {
                    System.out.print("Nhập thời gian bắt đầu (dd-MM-yyyy HH:mm): ");
                    String startInput = scanner.nextLine();
                    startDate = LocalDateTime.parse(startInput, formatter);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Enter not valid date");
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập thời gian kết thúc (dd-MM-yyyy HH:mm): ");
                    String endInput = scanner.nextLine();
                    endDate = LocalDateTime.parse(endInput, formatter);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Enter not valid date");
                }
            }

            Event event = new Event(name, startDate, endDate);
            manager.addEvent(event);
            manager.checkEventStatus(event);
        }

        scanner.close();
    }
}

