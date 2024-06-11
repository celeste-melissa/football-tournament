package football_tournament;

public class Player {
    //fields of player class
    String name;
    int age;
    String position;
    Team team;

    //constructor
    public Player(String name, int age, String position, Team team){
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public Team getTeam(){
        return team;
    }
    public void setTeam(Team team){
        this.team = team;
    }

}
