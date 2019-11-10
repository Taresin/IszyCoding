package odometerapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OdometerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter origin:");
        String origin = scanner.nextLine();

        System.out.println("Enter destination:");
        String destination = scanner.nextLine();

        System.out.println("Enter odoStart:");
        Integer odoStart = Integer.parseInt(scanner.nextLine());

        Long startTime = System.currentTimeMillis();

        Trip trip = new Trip(startTime, origin, destination, odoStart);

        System.out.println("Enter odoFinish:");
        Integer odoFinish = Integer.parseInt(scanner.nextLine());
        trip.odoFinish = odoFinish;

        Long finishTime = System.currentTimeMillis();
        trip.finishTime = finishTime;

        try {
            File file = new File("mileageSave.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(trip.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
