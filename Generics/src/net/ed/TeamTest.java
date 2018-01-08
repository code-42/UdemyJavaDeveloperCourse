package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {

    private League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
    private Team<FootballPlayer> team = new Team<>("Patriots");

    @Test
    public void getName() {
    }

    @Test
    public void addPlayer() {
    }

    @Test
    public void ranking() {
        int won = 2;
        int tied = 2;
        int expected = 6;
        int actual = team.ranking();

    }

    @Test
    public void compareTo() {
    }
}