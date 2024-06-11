package football_tournament;

public class Tournament {
    // class fields of the tournament class
    private String name;
    private String teams;
    private String matches;

    //constructor
    public Tournament(String name, String teams, String matches){
        this.name = name;
        this.teams = teams;
        this.matches = matches;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTeams(){
        return teams;
    }
    public void setTeams(String teams){
        this.teams = teams;
    }
    public String getMatches(){
        return matches;
    }
    public void setMatches(String matches){
        this.matches = matches;
    }
}
