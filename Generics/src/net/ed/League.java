package net.ed;

import java.util.ArrayList;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getName() + " is already in the League");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " added to League " + this.getName());
            return true;
        }
    }
}
