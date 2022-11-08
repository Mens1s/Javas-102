package Z_Homeworks.Collection.FixtureGenerator;

import java.util.*;

public class GenerateFixture {
    private int teamCount = 0;
    private final ArrayList<String> teams;
    List<int[]>fixture;

    GenerateFixture(){
        teams = new ArrayList<>();
        fixture = new ArrayList<>();
    }

    int addTeam(String teamName) {
        if(teamName.compareTo("Q") == 0) {
            if (teamCount % 2 != 0) {teamCount++;teams.add("Bay");}
            return -1;
        }

        teams.add(teamName);
        teamCount++;

        return teamCount;
    }

    List<List<Match>> generate() {
        Collections.shuffle(teams); //randomize the index

        int totalRounds = teamCount - 1;
        int matchesPerRound = teamCount / 2;

        List<List<Match>> rounds = new LinkedList<>();

        for (int round = 0; round < totalRounds; round++) {
            List<Match> matches = new LinkedList<>();

            for (int match = 0; match < matchesPerRound; match++) {

                int home = (round + match) % (teamCount - 1);

                int away = (teamCount - 1 - match + round) % (teamCount - 1);

                if (match == 0) away = teamCount - 1;

                matches.add(new Match(teams.get(home), teams.get(away)));
            }
            rounds.add(matches);
        }

        // Last team can't be away for every game so flip them
        // to home on odd rounds.
        for (int roundNumber = 0; roundNumber < rounds.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Match match = rounds.get(roundNumber).get(0); // last team always in the first game
                rounds.get(roundNumber).set(0, new Match(match.getAwayTeam(), match.getHomeTeam())); // flip it
            }
        }
        // second half of the season
        List<List<Match>> reverseFixtures = new LinkedList<>();
        for(List<Match> round: rounds){
            List<Match> reverseRound = new LinkedList<>();
            for(Match match : round){
                reverseRound.add(new Match(match.getAwayTeam(), match.getHomeTeam())); // flip it
            }
            reverseFixtures.add(reverseRound);
        }
        rounds.addAll(reverseFixtures);
        return rounds;

    }


    void display(List<List<Match>> all){
        int count=1;
        for(List<Match> round: all){
            System.out.println("----"+count+". Round -----");
            count++;
            for(Match match:round){
                System.out.println(match.getHomeTeam()+"-"+match.getAwayTeam());
            }

        }
    }
}
