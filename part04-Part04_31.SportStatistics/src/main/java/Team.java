    public class Team {
        private String name;
        private int games;
        private int wins;
        private int losses;
        
     
        public Team(String name) {
            this.name = name;
            games = 0;
            wins = 0;
            losses = 0;
        }
        
        public String getName() {
            return this.name;
        }
        
        public int getGames() {
            return this.games;
        }
        
        public int getWins() {
            return this.wins;
        }
        
        public int getLosses() {
            return this.losses;
        }
        
        public void incrementGames(){
            this.games = this.games + 1;
        }
        
        public void incrementWins(){
            this.wins = this.wins + 1;
        }
        
        public void incrementLosses(){
            this.losses = this.losses + 1;
        }
        
    }