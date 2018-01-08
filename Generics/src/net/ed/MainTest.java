package net.ed;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private League<Team<FootballPlayer>> footballLeague = new League<>("NFL");

    private Team<FootballPlayer> team = new Team<>("Patriots");

    @Test
    public void main() {

        footballLeague.addTeam(team);
    }

    @Test
    public void getName() {
        String expected = "NFL";
        String actual = footballLeague.getName();
        System.out.println("Calling footballLeague.getName() == " + actual);
        assertEquals(expected, actual);

        expected = "Patriots";
        actual = team.getName();
        System.out.println("Calling patriots.getName() == " + actual);
        assertEquals(expected, actual);
    }
}