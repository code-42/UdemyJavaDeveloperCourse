package net.ed;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        League bigLeague = new League("BigLeague");

        Team devTeam = new Team("Devs");
        devTeam.addTeam(devTeam);

        System.out.println(devTeam.numTeams());

        System.out.println(bigLeague.getName());

    }
}
