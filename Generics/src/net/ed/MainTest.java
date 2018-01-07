package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");

        Team<FootballPlayer> patriots = new Team<>("Patriots");

        footballLeague.addTeam(patriots);

    }
}