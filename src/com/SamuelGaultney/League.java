package com.SamuelGaultney;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Samuel on 3/28/2017.
 */
public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }

        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league); //because we wrote our own compareTo in Team
        for(T t: league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
