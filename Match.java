package football_tournament;

public class Match {
    // fields of match class
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;
    private Team winner;

    //constructor
    public Match(Team team1, Team team2, int score1, int score2, Team winner){
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.winner = winner;
    }
    //getter and setters
    public Team getTeam1(){
        return team1;
    }
    public void setTeam1(Team team1){
        this.team1 = team1;
    }
    public Team getTeam2(){
        return team2;
    }
    public void setTeam2(Team team2){
        this.team2 = team2;
    }
    public int getScore1(){
        return score1;
    }
    public void setScore1(int score1){
        this.score1 = score1;
    }
    public int getScore2(){
        return score2;
    }
    public void setScore2(int score2){
        this.score2 = score2;
    }
    public Team winner(){
        return winner;
    }
    public void setWinner(Team winner){
        this.winner = winner;
    }


}
