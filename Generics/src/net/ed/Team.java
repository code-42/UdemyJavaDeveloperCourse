package net.ed;

import java.util.ArrayList;

public class Team extends League {

    public Team(String name) {
        super(name);
    }

    public ArrayList<League> getTeams() {
        return teams;
    }

    private ArrayList<League> teams = new ArrayList<>();

    public int numTeams(){
        return this.teams.size();
    }
}
