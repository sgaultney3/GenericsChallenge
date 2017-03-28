package com.SamuelGaultney;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> atlantaFalcons = new Team<>("Atlanta Falcons");
        Team<FootballPlayer> dolphins = new Team<>("Dolphins");
        Team<FootballPlayer> patriots = new Team<>("Patriot");
        Team<FootballPlayer> packers = new Team<> ("Green Bay Packers");


        dolphins.matchResult(packers, 14, 27);
        atlantaFalcons.matchResult(packers, 14, 7);
        dolphins.matchResult(patriots, 35, 3);
        packers.matchResult(patriots, 63, 0);

        footballLeague.add(atlantaFalcons);
        footballLeague.add(dolphins);
        footballLeague.add(patriots);
        footballLeague.add(packers);

        //footballLeague.add(baseballTeam); generics are working

        footballLeague.showLeagueTable();

    }
}
