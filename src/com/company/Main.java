package com.company;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        Officer officer1 = new Officer("Mike", "Lowrey", 2211, 19);
        Officer officer2 = new Officer("Sam", "Spade", 2213, 85);
        Officer officer3 = new Officer("Will", "Graham", 2218, 81);
        Officer officer4 = new Officer("Clarice", "Starling", 2220, 10);
        Officer officer5 = new Officer("Jim", "Hopper", 2221, 7);
        Officer officer6 = new Officer("Harry", "Callahan", 2231, 24);
        Officer officer7 = new Officer("Luke", "Hobbs", 2245, 38);

        District district1 = new District("NYPD", "New York", 112);
        District district2 = new District("LAPD", "Los Angeles", 901);

//  Add three Officers in the first District and others in the second District.
        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

//  Print out all information about each District.
        System.out.println(district1.toString());
        System.out.println(district2.toString());
        System.out.println();

//  Calculate average level of each District.
        System.out.println("The average level in " + district1.getTitle() + " is " + district1.calculateAvgLevelInDistrict());
        System.out.println("The average level in " + district2.getTitle() + " is " + district2.calculateAvgLevelInDistrict());
        System.out.println();

//  Create an arraylist of the Districts and put both District objects in the arraylist.
        ArrayList<District> districts = new ArrayList<>();
        districts.add(district1);
        districts.add(district2);

        for (District district : districts) {
            System.out.println("District Name: " + district.getTitle());
            System.out.println("Officers in the district: " + district.getOfficersInTheDistrict().size());
            System.out.println();
        }

//  Calculate how many Officers are in both Districts.
        int totalOfficers;
        totalOfficers = district1.getOfficersInTheDistrict().size() + district2.getOfficersInTheDistrict().size();
        System.out.println("Officers in both districts: " + totalOfficers);
        System.out.println();

//  Calculate the average level of both Districts.
        System.out.println("Average level of both districts is: " +
                (district1.calculateAvgLevelInDistrict() + district2.calculateAvgLevelInDistrict()) / 2);
        System.out.println();

//  Find out which District is the best based on the average level of Officers.
        if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println(district1.getTitle() + " is better based on the average level of Officers ");
        }
        else {
            System.out.println(district2.getTitle() + " is better based on the average level of Officers ");
        }
        System.out.println();

//  Create three Lawyers as objects.
//  Create an arraylist for Lawyers storing.
//  Put all Lawyers in it. Print out information about all Lawyers.
        ArrayList<Lawyer> allTheLawyers = new ArrayList<>(asList(
                new Lawyer("Denny", "Crane", 111, 62),
                new Lawyer("Shirley", "Schmidt", 222, 53),
                new Lawyer("Alan", "Shore", 333, 98)
        ));
        System.out.println("The Lawyers are");
        for (Lawyer lawyers : allTheLawyers) {
            System.out.println(lawyers);
        }
        System.out.println();

//  Find out the total number of the crimes in which solving the Lawyers were involved -> https://www.baeldung.com/java-8-collectors
        System.out.println("The total number of crimes solved by lawyers: " +
                (Integer) allTheLawyers.stream().mapToInt(Lawyer::getHelpedInCrimeSolving).sum());

//  Find out which Lawyer has helped the most to solve crimes.
        System.out.println("Best Lawyer: " +
                allTheLawyers.stream()
                        .max(Comparator.comparingInt(Lawyer :: getHelpedInCrimeSolving)));

    }

}