package session10;

import java.util.Scanner;

class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Vehicle is moving.");
    }

    public void move(int speed) {
        System.out.println("Vehicle is moving at " + speed + " km/h.");
    }
}

class MotorVehicle extends Vehicle {
    protected String fuelType;

    public MotorVehicle(String brand, int year, String fuelType) {
        super(brand, year);
        this.fuelType = fuelType;
    }

    @Override
    public void move(int speed) {
        System.out.println("MotorVehicle is moving at " + speed + " km/h.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends MotorVehicle {
    public Car(String brand, int year, String fuelType) {
        super(brand, year, fuelType);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started. Vroom!");
    }
}

class Motorcycle extends MotorVehicle {
    public Motorcycle(String brand, int year, String fuelType) {
        super(brand, year, fuelType);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started. Brrrm!");
    }
}

class Truck extends MotorVehicle {
    public Truck(String brand, int year, String fuelType) {
        super(brand, year, fuelType);
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started. Grrr!");
    }
}

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MotorVehicle vehicle = null;

        while (true) {
            System.out.println("===============================");
            System.out.println("= VEHICLE MANAGEMENT APP =");
            System.out.println("===============================");
            System.out.println("1. Create a new vehicle");
            System.out.println("2. Display vehicle information");
            System.out.println("3. Start engine");
            System.out.println("4. Move vehicle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter fuel type (xăng/dầu): ");
                    String fuelType = scanner.nextLine();

                    System.out.println("Choose vehicle type:");
                    System.out.println("1. Car");
                    System.out.println("2. Motorcycle");
                    System.out.println("3. Truck");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    switch (type) {
                        case 1:
                            vehicle = new Car(brand, year, fuelType);
                            break;
                        case 2:
                            vehicle = new Motorcycle(brand, year, fuelType);
                            break;
                        case 3:
                            vehicle = new Truck(brand, year, fuelType);
                            break;
                        default:
                            System.out.println("Invalid vehicle type.");
                            continue;
                    }
                    System.out.println("=> Vehicle created successfully!");
                    break;

                case 2:
                    if (vehicle != null) {
                        vehicle.displayInfo();
                    } else {
                        System.out.println("No vehicle created yet.");
                    }
                    break;

                case 3:
                    if (vehicle != null) {
                        vehicle.startEngine();
                    } else {
                        System.out.println("No vehicle created yet.");
                    }
                    break;

                case 4:
                    if (vehicle != null) {
                        System.out.print("Enter speed (km/h): ");
                        int speed = scanner.nextInt();
                        scanner.nextLine();
                        vehicle.move(speed);
                    } else {
                        System.out.println("No vehicle created yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Vehicle Management App.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
    }
}
