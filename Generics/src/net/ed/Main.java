package net.ed;

import java.util.ArrayList;

// Section 11 Lecture 86 Generics Challenge
// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");

        Team<FootballPlayer> patriots = new Team<>("Patriots");

        footballLeague.addTeam(patriots);

        patriots.addPlayer(new FootballPlayer("Gronk"));

    }
}
