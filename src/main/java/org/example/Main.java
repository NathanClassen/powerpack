package org.example;

import org.example.powerpack.Bag;
import org.example.powerpack.OverPackingException;
import org.example.powerpack.Powerpack;

public class Main {
    public static void main(String[] args) {
        Integer capacity = 0;
        if (args.length > 0) {
            try {
                Integer arg = Integer.parseInt(args[0]);
                if (arg > 0) {
                    capacity = arg;
                } else {
                    System.out.println("Please provide a maximum weight capacity greater than 0.");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Maximum weight capacity must be specified as an integer, greater than 0.");
                System.exit(0);
            }
        } else {
            capacity = 27;
        }
        Bag bag = new Bag(capacity);
        try {
            Powerpack.packBag(bag);
        } catch (OverPackingException e) {
            System.out.println("WARNING: " + e.getMessage());
        }
        System.out.println(bag.getContents());
    }
}