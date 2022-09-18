
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>(); 
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Match> matches =  readRecordsFromFile(file);
               
        ArrayList<String> teamNames = new ArrayList<>();
        
        for(Match m: matches) {
            
            if(!teamNames.contains(m.getHomeTeam())) {
                teamNames.add(m.getHomeTeam());
                Team t1 = new Team(m.getHomeTeam());
                t1.incrementGames();
                if(m.getHomePoints()>m.getAwayPoints()){
                    t1.incrementWins();
                } else {
                    t1.incrementLosses();
                }
                teams.add(t1);
            } else {
                for(Team t: teams) {
                    if(t.getName().equals(m.getHomeTeam())) {
                        t.incrementGames();
                        if(m.getHomePoints()>m.getAwayPoints()) {
                            t.incrementWins();
                        } else {
                            t.incrementLosses();
                        }
                    }
                }
                
            }
            if(!teamNames.contains(m.getAwayTeam())) {
                teamNames.add(m.getAwayTeam());
                Team t1 = new Team(m.getAwayTeam());
                t1.incrementGames();
                if(m.getAwayPoints()>m.getHomePoints()){
                    t1.incrementWins();
                } else {
                    t1.incrementLosses();
                }
                teams.add(t1);
            } else {
                for(Team t: teams) {
                    if(t.getName().equals(m.getAwayTeam())) {
                        t.incrementGames();
                        if(m.getAwayPoints()>m.getHomePoints()) {
                            t.incrementWins();
                        } else {
                            t.incrementLosses();
                        }
                    }
                }
                
            }
            
        }
        System.out.println("Team:");
        String teamName = scan.nextLine();
        boolean isTeam = false;
        for(Team t: teams) {
            if(teamName.equals(t.getName())) {
                isTeam = true;
                System.out.println("Games: "+t.getGames());
                System.out.println("Wins: "+t.getWins());
                System.out.println("Losses: "+t.getLosses());
                break;
            }
        }
        if(isTeam == false) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
        
    }
    
    
    public static ArrayList<Match> readRecordsFromFile(String file) {
        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] data = line.split(",");

                String homeTeam = data[0];
                String awayTeam = data[1];
                int homeScore = Integer.valueOf(data[2]);
                int awayScore = Integer.valueOf(data[3]);

                matches.add(new Match(homeTeam, awayTeam, homeScore, awayScore));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return matches;
    }
}
