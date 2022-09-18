
public class Match {
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;
    
    public Match(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    public int getHomePoints() {
        return this.homePoints;
    }
    
    public int getAwayPoints() {
        return this.awayPoints;
    }
    
}
