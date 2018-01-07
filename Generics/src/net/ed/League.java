package net.ed;

import java.util.ArrayList;

public class League {

    private String name;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ArrayList<League> leagues = new ArrayList<League>();

    public boolean addTeam(Team team){
        if(leagues.contains(team)){
            System.out.println(team.getName() + " is already in the League");
            return false;
        } else {
            leagues.add(team);
            System.out.println(team.getName() + " added to League");
            return true;
        }
    }
}
