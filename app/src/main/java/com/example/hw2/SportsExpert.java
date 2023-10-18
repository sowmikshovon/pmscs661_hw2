package com.example.hw2;

import java.util.ArrayList;

public class SportsExpert {
    ArrayList<String> getBrands(String sport) {
        ArrayList<String> teams = new ArrayList<>();
        if (sport.equals("Football")) {
            teams.add("Argentina(2022)");
            teams.add("France(2018)");
            teams.add("Germany(2014)");
            teams.add("Spain(2010)");
            teams.add("Italy(2006)");
        } else if (sport.equals("Cricket")) {
            teams.add("England(2019)");
            teams.add("Australia(2015)");
            teams.add("India(2011)");
            teams.add("Australia(2007)");
            teams.add("Australia(2003)");
        } else if (sport.equals("Hockey")) {
            teams.add("Germany(2023)");
            teams.add("Belgium(2018)");
            teams.add("Australia(2014)");
            teams.add("Australia(2010)");
            teams.add("Germany(2006)");
        } else if (sport.equals("Rugby")) {
            teams.add("South Africa(2019)");
            teams.add("New Zealand(2015)");
            teams.add("New Zealand(2011)");
            teams.add("South Africa(2007)");
            teams.add("England(2003)");
        } else if (sport.equals("BasketBall")) {
            teams.add("Germany(2023)");
            teams.add("Spain(2019)");
            teams.add("United States(2014)");
            teams.add("United States(2010)");
            teams.add("Spain(2006)");
        }
        return teams;
    }
}
