package football_tournament;

public class Team {
    //fields of the team class
    private String name;
    private String players;

    //constructor
    public Team(String name, String players){
        this.name = name;
        this.players = players;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String players(){
        return players;
    }
    public void setPlayers(String players){
        this.players = players;
    }

}
