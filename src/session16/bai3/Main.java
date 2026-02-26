package session16.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatApp chatApp = new ChatApp();

        while (true) {
            System.out.println("\n--- Chat Application ---");
            System.out.println("1. Send Message");
            System.out.println("2. View Chat History");
            System.out.println("3. Filter Messages by Sender");
            System.out.println("4. Filter Messages by Date");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter sender name: ");
                    String sender = scanner.nextLine();
                    System.out.print("Enter message content: ");
                    String content = scanner.nextLine();
                    chatApp.sendMessage(sender, content);
                    break;
                case 2:
                    chatApp.showHistory();
                    break;
                case 3:
                    System.out.print("Enter sender name to filter: ");
                    String filterSender = scanner.nextLine();
                    chatApp.filterBySender(filterSender);
                    break;
                case 4:
                    System.out.print("Enter date (dd/MM/yyyy): ");
                    String dateInput = scanner.nextLine();
                    chatApp.filterByDate(dateInput);
                    break;
                case 0:
                    System.out.println("Exiting chat application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

