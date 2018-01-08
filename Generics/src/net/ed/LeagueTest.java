package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeagueTest {

    League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
    Team<FootballPlayer> team = new Team<>("Patriots");

    @org.junit.Test
    public void getName() {
        String expected = "NFL";
        String actual = footballLeague.getName();
        System.out.println("footballLeague.getName() == " + actual);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void addTeam() {
        boolean teamAdded;
        teamAdded = footballLeague.addTeam(team);
        assert(teamAdded);
    }

}