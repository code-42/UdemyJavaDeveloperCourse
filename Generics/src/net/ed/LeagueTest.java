package net.ed;

import static org.junit.Assert.*;

public class LeagueTest {

    @org.junit.Test
    public void getName() {
        fail("test not implemented yet");
    }

    @org.junit.Test
    public void addTeam() {
        boolean teamAdded;
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        Team<FootballPlayer> patriots = new Team<>("Patriots");
        teamAdded = footballLeague.addTeam(patriots);
        assert(teamAdded);
    }
}